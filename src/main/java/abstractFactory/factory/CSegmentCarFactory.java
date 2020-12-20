package abstractFactory.factory;


import abstractFactory.cars.companies.Car;
import abstractFactory.cars.companies.audi.csegment.A3;
import abstractFactory.cars.companies.bmw.csegment.BMW1;
import abstractFactory.cars.companies.mercedes.csegment.MercedesA;

public class CSegmentCarFactory extends AbstractCarSegmentFactory {

  @Override
  public Car getAudi() {
    return new A3("A3");
  }

  @Override
  public Car getMercedes() {
    return new MercedesA("MercedesA-class");
  }

  @Override
  public Car getBMW() {
    return new BMW1("BMW-1");
  }
}
