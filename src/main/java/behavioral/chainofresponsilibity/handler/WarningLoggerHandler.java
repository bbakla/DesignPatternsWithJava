package behavioral.chainofresponsilibity.handler;

import behavioral.chainofresponsilibity.Log;

public class WarningLoggerHandler extends AbstractHandler {

  public WarningLoggerHandler(Handler handler) {
    super(handler);
  }

  @Override
  public void log(Log log) {

    if (log.getPriority().getPrio() == 2) {
       logConsole(log);
       System.out.println("Saving warn log to the log file");
    }
    else {
      handler.log(log);
    }
  }
}
