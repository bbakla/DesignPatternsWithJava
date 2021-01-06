package structural.flyweight.flyweights;

public class Farmer implements Person {

  //private Productivity productivity;
  private AgeInterval age;

  public Farmer(AgeInterval age) {
    this.age = age;
  }

  @Override
  public int produce() {
    if(this.age.equals(AgeInterval.CHILD)) {
      return Productivity.BAD.getProductivityPoint();
    } else if(this.age.equals(AgeInterval.OLD)) {
      return Productivity.OK.getProductivityPoint();
    }

    return Productivity.GOOD.getProductivityPoint();
  }

  @Override
  public int consume() {
    if(this.age.equals(AgeInterval.CHILD)) {
      return ConsumeRate.LITTLE.getConsumeRate();
    } else if(this.age.equals(AgeInterval.OLD)) {
      return ConsumeRate.A_LOT.getConsumeRate();
    }

    return ConsumeRate.LITTLE.getConsumeRate();
  }
}
