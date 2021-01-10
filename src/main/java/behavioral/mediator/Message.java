package behavioral.mediator;

public class Message {

  private String message;
  private Event event;

  public Message(String message, Event event) {
    this.message = message;
    this.event = event;
  }

  public String getMessage() {
    return message;
  }

  public Event getEvent() {
    return event;
  }

  @Override
  public String toString() {
    return "Message{" +
        "message='" + message + '\'' +
        ", event=" + event +
        '}';
  }
}
