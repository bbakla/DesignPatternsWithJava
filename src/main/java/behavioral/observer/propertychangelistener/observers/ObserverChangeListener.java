package behavioral.observer.propertychangelistener.observers;

import behavioral.observer.classic.Message;
import java.beans.PropertyChangeListener;

public interface ObserverChangeListener extends PropertyChangeListener {
  public String getName();
  public void notified(Message message);

}
