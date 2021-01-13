package behavioral.observer.classic.observers;

import behavioral.observer.classic.Message;

public interface Observer {
  public String getName();
  public void notified(Message message);

}
