package creational.builderPattern.classical.product.components;

public abstract class AbstractComponent implements Component {
  private String name;

  public AbstractComponent(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Item is %s\tProduct spec is:%s", this.name, this.productSpec());
  }

  public String getName() {
    return name;
  }

  public abstract String productSpec();
}
