package creational.abstractFactory.factory;

import creational.abstractFactory.cars.companies.Car;

public abstract class AbstractCarSegmentFactory {

  public abstract Car getAudi();
  public abstract Car getMercedes();
  public abstract Car getBMW();

}
