package creational.abstractFactory.cars.companies.audi.csegment;

import creational.abstractFactory.cars.companies.audi.Audi;


public class A3 extends Audi {

  public A3(String model) {
    super(model);
  }

  @Override
  public String toString() {
    return String.format("%s %s: %s", super.toString(), "C-segment car", getModel());
  }
}
