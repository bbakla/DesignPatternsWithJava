package builderPattern.classical.product;

import builderPattern.classical.product.components.Component;

public class Car extends AbstractProduct {
  private String name;

  public Car(String name) {
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
