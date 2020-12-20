package creational.abstractFactory.cars.companies.bmw.csegment;


import creational.abstractFactory.cars.companies.bmw.BMW;

public class BMW1 extends BMW {

  public BMW1(String model) {
    super(model);
  }

  @Override
  public String toString() {
    return super.toString() + " C-segment car: BMW1";
  }
}
