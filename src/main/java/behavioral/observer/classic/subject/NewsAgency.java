package behavioral.observer.classic.subject;

import behavioral.observer.classic.Message;
import behavioral.observer.classic.observers.Observer;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class NewsAgency implements Subject {

  private Map<String, Observer> observers = new ConcurrentHashMap();
  private final Object MUTEX = new Object();

  @Override
  public void subscribe(Observer observer) {
    synchronized (MUTEX) {
      var observerSubscribed = observers.get(observer.getName());
      if (observerSubscribed == null) {
        observers.put(observer.getName(), observer);
      } else {
        System.out.println("Already subscribed");
      }
    }
  }

  @Override
  public void unsubscribe(String name) {
    synchronized (MUTEX) {
      var removed = observers.entrySet().removeIf(o -> o.getKey().equals(name));

      if (removed) {
        System.out.printf("%s is removed. Number of observers :%d", name, observers.size());
      }
    }
  }

  /**
   * We create a copy of observers here and call them outside of the synchronized block
   * to avoid keeping the mutex blocked longer than expected.
   * if we would called the map directly within the synchronized block, notifying the observers
   * could have been lasted longer and the mutex would be locked. That would cause problem, when
   * subscribe and/or unsubscribe methods are called at the same time. They wouldnt get into thir
   * synchronized block since the mutex is already locked by publish method.
   *
   */
  @Override
  public void publish(Message message) {
    Set<Observer> observerCopy;

    synchronized (MUTEX) {
      observerCopy = observers.values().stream().collect(Collectors.toSet());
    }
    observerCopy.forEach(o -> o.notified(message));

    System.out.println("--------------------------------");
  }

}
