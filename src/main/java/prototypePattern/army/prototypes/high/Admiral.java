package prototypePattern.army.prototypes.high;

/*
This class overrides the clone() method of its parent. I just did it to show a different way to
create a copy of the object.
* */

import prototypePattern.army.prototypes.Soldier;

public class Admiral extends Soldier {

  private int promotionYear;

public Admiral(String name) {
  super(name);
}

  public Admiral(Admiral soldier) {
    super(soldier.getName());
    super.rank = soldier.getRank();
    this.promotionYear = soldier.getPromotionYear();
  }

  public int getPromotionYear() {
    return promotionYear;
  }

  @Override
  public void orders() {
    System.out.println("He is a god");
  }

  @Override
  public Soldier clone() {
    return new Admiral(this);
  }
}
