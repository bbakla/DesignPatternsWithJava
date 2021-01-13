package behavioral.observer.classic.subject;

import behavioral.observer.classic.Message;
import behavioral.observer.classic.observers.Observer;

public interface Subject {
  public void subscribe(Observer observer);
  public void unsubscribe(String name);
  void publish(Message message);
}
