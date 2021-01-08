package behavioral.chainofresponsilibity;

import behavioral.chainofresponsilibity.handler.FatalLoggerHandler;
import behavioral.chainofresponsilibity.handler.Handler;
import behavioral.chainofresponsilibity.handler.NotImportantLoggerHandler;
import behavioral.chainofresponsilibity.handler.WarningLoggerHandler;

public class Client {

  public static void main(String[] args) {

    Handler fatalHandler = new FatalLoggerHandler(null, "b@b.com");
    Handler warningHandler = new WarningLoggerHandler(fatalHandler);
    Handler notImportantLoggerHandler = new NotImportantLoggerHandler(warningHandler);

    var log = new Log(Priority.DEBUG, "debug log");
    notImportantLoggerHandler.log(log);
    System.out.printf("\n%s\n", "..................");

    log = new Log(Priority.WARNING, "warning log");
    notImportantLoggerHandler.log(log);
    System.out.printf("\n%s\n", "..................");

    log = new Log(Priority.FATAL, "error log");
    notImportantLoggerHandler.log(log);
    System.out.printf("\n%s\n", "..................");
  }
}
