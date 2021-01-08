package behavioral.chainofresponsilibity.handler;

import behavioral.chainofresponsilibity.Log;

public class FatalLoggerHandler extends AbstractHandler {

  private String email;
  public FatalLoggerHandler(Handler handler, String email) {
    super(handler);
    this.email = email;
  }
  @Override
  public void log(Log log) {

    if (log.getPriority().getPrio() == 3) {
       logConsole(log);
       System.out.printf("Also sending an email to %s\n", email);
    }
  }
}
