package creational.abstractFactory.cars.companies.mercedes;

import creational.abstractFactory.cars.companies.Car;

public abstract class Mercedes implements Car {
  private String model;

    public Mercedes(String model) {
      this.model = model;
    }

    @Override
    public void setModel(String model) {
      this.model = model;
    }

    @Override
    public String getModel() {
      return model;
    }

    @Override
    public String toString() {
      return "This is an Mercedes";
    }

}
