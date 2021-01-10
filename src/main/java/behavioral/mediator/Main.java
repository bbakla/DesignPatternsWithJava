package behavioral.mediator;

import behavioral.mediator.components.BaggagePersonal;
import behavioral.mediator.components.Truck;
import behavioral.mediator.components.Plane;
import behavioral.mediator.mediator.Tower;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    var mediator = new Tower();

    var truckRegistersTo = new ArrayList<Event>();
    truckRegistersTo.add(Event.RUNWAY_REQUEST);
    truckRegistersTo.add(Event.LANDING_PERMISSION);
    truckRegistersTo.add(Event.TAKE_OFF_PERMISSION);
    var truck1 = new Truck("truck1", mediator, truckRegistersTo);

    var planeRegistersTo = new ArrayList<Event>();
    planeRegistersTo.add(Event.TAKE_OFF_PERMISSION);
    planeRegistersTo.add(Event.ASSISTING_PLANE);
    var plane2 = new Plane("plane2", mediator, planeRegistersTo);

    var baggagePersonalRegistersTo = new ArrayList<Event>();
    baggagePersonalRegistersTo.add(Event.LANDING_PERMISSION);
    baggagePersonalRegistersTo.add(Event.RUNWAY_REQUEST);
    var baggagePersonal1 = new BaggagePersonal("personal1", mediator, baggagePersonalRegistersTo);

    mediator.addMember(truck1);
    mediator.addMember(plane2);
    mediator.addMember(baggagePersonal1);

    plane2.sendMessage(new Message("I am about to arrive", Event.LANDING_PERMISSION));
    plane2.sendMessage(new Message("But where???", Event.RUNWAY_REQUEST));

    baggagePersonal1.sendMessage(new Message("I am back in the building", Event.ASSISTING_PLANE));

    truck1.sendMessage(new Message("Get the landing message. Going to the runway.", Event.ASSISTING_PLANE));



  }

}
