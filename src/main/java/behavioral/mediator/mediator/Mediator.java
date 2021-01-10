package behavioral.mediator.mediator;

import behavioral.mediator.Message;
import behavioral.mediator.components.Component;

public interface Mediator {

  void addMember(Component component);
  void removeMember(String vehicleId);
  void notifyVehicles(String senderId, Message event);
}
