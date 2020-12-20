package creational.abstractFactory.cars.companies.bmw.dsegment;


import creational.abstractFactory.cars.companies.bmw.BMW;

public class BMW3 extends BMW {

  public BMW3(String model) {
    super(model);
  }

  @Override
  public String toString() {
    return super.toString() + " C-segment car: BMW3";
  }
}
