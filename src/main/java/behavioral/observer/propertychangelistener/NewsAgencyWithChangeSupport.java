package behavioral.observer.propertychangelistener;

import behavioral.observer.classic.Message;
import behavioral.observer.propertychangelistener.observers.ObserverChangeListener;
import java.beans.PropertyChangeSupport;

//Subject
public class NewsAgencyWithChangeSupport implements SubjectChangeSupport {
  private PropertyChangeSupport support = new PropertyChangeSupport(this);

  @Override
  public void subscribe(ObserverChangeListener observer) {
    support.addPropertyChangeListener(observer);
  }

  @Override
  public void unsubscribe(ObserverChangeListener observer) {
    support.removePropertyChangeListener(observer);
  }

  @Override
  public void publish(Message message) {
    support.firePropertyChange("a", null, message);
  }
}
