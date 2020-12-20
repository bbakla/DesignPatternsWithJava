package abstractFactory.factory;


import abstractFactory.cars.companies.Car;
import abstractFactory.cars.companies.audi.dsegment.A4;
import abstractFactory.cars.companies.bmw.dsegment.BMW3;
import abstractFactory.cars.companies.mercedes.dsegment.MercedesC;

public class DSegmentCarFactory extends AbstractCarSegmentFactory {

  @Override
  public Car getAudi() {
    return new A4("A4");
  }

  @Override
  public Car getMercedes() {
    return new MercedesC("MercedesC-class");
  }

  @Override
  public Car getBMW() {
    return new BMW3("BMW-3");
  }
}
