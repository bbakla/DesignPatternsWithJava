package abstractFactory.cars.companies.audi.dsegment;


import abstractFactory.cars.companies.audi.Audi;

public class A4 extends Audi {

  public A4(String model) {
    super(model);
  }

  @Override
  public String toString() {
    return String.format("%s %s: %s", super.toString(), "D-segment car", getModel());
  }
}
