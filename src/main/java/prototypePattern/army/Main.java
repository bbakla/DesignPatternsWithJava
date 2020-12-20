package prototypePattern.army;

import prototypePattern.army.prototypes.high.Admiral;
import prototypePattern.army.prototypes.low.Lieutenant;
import prototypePattern.army.prototypes.low.Sergeant;
import prototypePattern.army.prototypes.Soldier;

public class Main {

  public static void main(String[] args) throws  Exception {
    Soldier sergeant1 = new Sergeant("Ahmet");
    Soldier lieutenant = new Lieutenant("Cenk");

    var sergeant2 = sergeant1.clone();
    sergeant2.setName("Mehmet");

    var lieutenant2 = lieutenant.clone();
    lieutenant2.setName("Türker");

    //As you can see without knowing the concrete class, we obtained another object by cloning.
    System.out.println(lieutenant.getName());
    System.out.println(lieutenant2.getName());

    Soldier admiral = new Admiral("Atilgan");
    var admiral2 = admiral.clone();
    System.out.println(admiral == admiral2);
    System.out.printf("name of first Admiral:%s\tname of second Admiral:%s", admiral.getName(), admiral.getName());

  }

}
