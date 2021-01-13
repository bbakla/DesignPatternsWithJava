package behavioral.observer.propertychangelistener.observers;

import behavioral.observer.classic.Message;
import java.beans.PropertyChangeEvent;

public class AbstractObserver implements ObserverChangeListener {

  private String name;
  public AbstractObserver(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void notified(Message message) {
    System.out.printf("%s get the message:%s\n", this.name, message);
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    this.notified((Message) evt.getNewValue());
  }
}
