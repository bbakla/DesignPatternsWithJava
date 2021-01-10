package behavioral.mediator.components;

import behavioral.mediator.Event;
import behavioral.mediator.Message;
import java.util.List;

public interface Component {

  public String getVehicleId();
  public void receiveMessage(Message message);
  public void sendMessage(Message message);
  public void register(List<Event> events);
  public List<Event> getRegistration();

}
