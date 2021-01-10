package behavioral.mediator.components;

import behavioral.mediator.Event;
import behavioral.mediator.Message;
import behavioral.mediator.mediator.Mediator;
import java.util.List;

public class Plane extends AbstractComponent {

  public Plane(String id, Mediator mediator, List<Event> registeredEvents) {
    super(id, mediator, registeredEvents);
  }

  @Override
  public void receiveMessage(Message message) {
    System.out.printf("Plane %s got the message: %s\n", id, message);
  }

  @Override
  public void register(List<Event> events) {
  /*  var eventsToRegister = new ArrayList<Event>();
    eventsToRegister.add(Event.LANDING_PERMISSION);
    eventsToRegister.add(Event.RUNWAY_REQUEST);*/

    this.mediator.addMember(this);
  }
}
