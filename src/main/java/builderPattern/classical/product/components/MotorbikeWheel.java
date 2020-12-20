package builderPattern.classical.product.components;

public class MotorbikeWheel extends AbstractComponent {

  public MotorbikeWheel(String name) {
    super(name);
  }

  @Override
  public String productSpec() {
    return "Motorbike wheel";
  }
}
