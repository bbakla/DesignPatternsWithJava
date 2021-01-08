package behavioral.chainofresponsilibity;

public class Log {
  private Priority priority;
  private String message;

  public Log(Priority priority, String message) {
    this.priority = priority;
    this.message = message;
  }

  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
