package creational.builderPattern.classical.product.components;

public class CarWheel extends AbstractComponent {

  public CarWheel(String name) {
    super(name);
  }

  @Override
  public String productSpec() {
    return "Car wheel";
  }
}
