package creational.prototypePattern.army.prototypes.low;

import creational.prototypePattern.army.prototypes.Rank;
import creational.prototypePattern.army.prototypes.Soldier;

public class Lieutenant extends Soldier {

  public Lieutenant(String name) {
    super(name);
    super.rank = Rank.LIEUTENANT;
  }

/*  @Override
  public Soldier clone() throws CloneNotSupportedException {
    return (Sergeant) super.clone();
  }*/

  @Override
  public void orders() {
    System.out.println("Lieutenants are educated");
  }

}
