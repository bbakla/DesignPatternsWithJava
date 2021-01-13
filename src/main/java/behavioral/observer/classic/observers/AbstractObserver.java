package behavioral.observer.classic.observers;

import behavioral.observer.classic.Message;

public class AbstractObserver implements Observer {

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
}
