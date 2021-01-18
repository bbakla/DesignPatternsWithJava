package behavioral.strategy.java8;

import java.util.function.Supplier;

public class CallApp {
  private Runnable callMode;

  public CallApp(Runnable defaultCall) {
    this.callMode = defaultCall;
  }

  public void call() {
    System.out.println("Calling");

    callMode.run();
  }

  public void changeCallMode(Runnable strategy) {
    this.callMode = strategy;
    System.out.println("Changing call mode");
    this.callMode.run();
  }

}
