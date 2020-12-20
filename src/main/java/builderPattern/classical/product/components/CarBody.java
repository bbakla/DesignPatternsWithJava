package builderPattern.classical.product.components;

public class CarBody extends AbstractComponent {
  public CarBody(String name) {
    super(name);
  }

  @Override
  public String productSpec() {
    return "car body";
  }
}
