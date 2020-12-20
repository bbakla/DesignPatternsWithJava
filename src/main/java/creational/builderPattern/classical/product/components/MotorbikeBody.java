package creational.builderPattern.classical.product.components;

public class MotorbikeBody extends AbstractComponent {
  public MotorbikeBody(String name) {
    super(name);
  }

  @Override
  public String productSpec() {
    return "motor body";
  }
}
