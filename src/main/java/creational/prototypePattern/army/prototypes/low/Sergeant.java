package creational.prototypePattern.army.prototypes.low;

import creational.prototypePattern.army.prototypes.Rank;
import creational.prototypePattern.army.prototypes.Soldier;

public class Sergeant extends Soldier {

  public Sergeant(String name) {
    super(name);
    super.rank = Rank.SERGEANT;
  }

/*  @Override
  public Soldier clone() throws CloneNotSupportedException {
    return (Sergeant) super.clone();
  }*/

  @Override
  public void orders() {
    System.out.println("Sergeants can order 4 teams");
  }

}
