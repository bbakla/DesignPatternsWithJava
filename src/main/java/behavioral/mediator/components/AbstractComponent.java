package behavioral.mediator.components;

import behavioral.mediator.Event;
import behavioral.mediator.Message;
import behavioral.mediator.mediator.Mediator;
import java.util.List;

public abstract  class AbstractComponent implements Component {

  protected String id;
  protected Mediator mediator;
  protected List<Event> registeredEvents;

  public AbstractComponent(String id, Mediator mediator, List<Event> registeredEvents) {
    this.id = id;
    this.mediator = mediator;
    this.registeredEvents = registeredEvents;
  }

  @Override
  public String getVehicleId() {
    return this.id;
  }

  @Override
  public void sendMessage(Message message) {
    mediator.notifyVehicles(this.id, message);
  }

  @Override
  public List<Event> getRegistration() {
    return this.registeredEvents;
  }
}
