package abstractFactory.cars.companies.bmw;


import abstractFactory.cars.companies.Car;

public abstract class BMW implements Car {

  private String model;

  public BMW(String model) {
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
    return "This is an BMW";
  }

}
