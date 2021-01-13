package behavioral.observer.propertychangelistener;

import behavioral.observer.classic.Message;
import behavioral.observer.propertychangelistener.observers.ObserverChangeListener;


public interface SubjectChangeSupport {
  public void subscribe(ObserverChangeListener observer);
  public void unsubscribe(ObserverChangeListener observer);
  void publish(Message message);
}
