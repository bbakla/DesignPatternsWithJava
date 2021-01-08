package behavioral.chainofresponsilibity.handler;

import behavioral.chainofresponsilibity.Log;

public abstract class AbstractHandler implements Handler {

  protected Handler handler;

  public AbstractHandler(Handler handler) {
    this.handler = handler;
  }

  protected void logConsole(Log log) {
    System.out.printf("[%s]: %s\n", log.getPriority(), log.getMessage());
  }

}
