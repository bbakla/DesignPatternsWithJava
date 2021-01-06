package structural.flyweight.flyweights;

//Flyweight
public class Soldier implements Person {

  //private Productivity productivity;
  private AgeInterval age;

  public Soldier(AgeInterval age) {
    this.age = age;
  }

  @Override
  public int produce() {
    if (this.age.equals(AgeInterval.YOUNG)) {
      return Productivity.GOOD.getProductivityPoint();
    }
    return Productivity.OK.getProductivityPoint();
  }

  @Override
  public int consume() {
    return ConsumeRate.A_LOT.getConsumeRate();
  }
}
