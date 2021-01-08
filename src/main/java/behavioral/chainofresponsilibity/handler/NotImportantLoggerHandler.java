package behavioral.chainofresponsilibity.handler;

import behavioral.chainofresponsilibity.Log;

public class NotImportantLoggerHandler extends AbstractHandler {

  public NotImportantLoggerHandler(Handler handler) {
    super(handler);
  }

  @Override
  public void log(Log log) {

    if (log.getPriority().getPrio()  <= 1) {
       logConsole(log);
    }
    else {
      handler.log(log);
    }
  }
}
