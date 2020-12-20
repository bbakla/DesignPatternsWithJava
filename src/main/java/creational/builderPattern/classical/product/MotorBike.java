package creational.builderPattern.classical.product;


import creational.builderPattern.classical.product.components.Component;

public class MotorBike extends AbstractProduct {
  private String name;

  public MotorBike(String name) {
    this.name = name;
  }

  @Override
  public void add(Component component) {
    components.add(component);
  }

  @Override
  public String getName() {
    return name;
  }
}
