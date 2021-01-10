package behavioral.mediator.mediator;

import behavioral.mediator.Message;
import behavioral.mediator.components.Component;
import java.util.ArrayList;
import java.util.List;

public class Tower implements Mediator {

  private List<Component> components = new ArrayList<>();

  @Override
  public void addMember(Component component) {
    //We can add a check if vehicle already exists but ignore if for simplicity.
     components.add(component);
  }

  @Override
  public void removeMember(String vehicleId) {
    components.removeIf(v -> v.getVehicleId().equals(vehicleId));
  }

  @Override
  public void notifyVehicles(String senderId, Message message) {

    components.forEach(v -> {
      if (v.getRegistration().contains(message.getEvent())) {
        v.receiveMessage(message);
      }
    });

    System.out.println("---------------------------------------------------");

  }
}
