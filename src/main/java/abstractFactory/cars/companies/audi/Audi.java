package abstractFactory.cars.companies.audi;


import abstractFactory.cars.companies.Car;

public abstract class Audi  implements Car {
  private String model;

  public Audi(String model) {
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
    return "This is an AUDI";
  }

}
