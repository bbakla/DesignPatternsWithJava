package builderPattern.classical;

import builderPattern.classical.builder.Builder;
import builderPattern.classical.product.Product;

public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void changeBuilder(Builder builder) {
    this.builder = builder;
  }

  public void Construct() {
    builder.addBody()
        .addWheels()
        .build()
        .show();
  }

  public Product getProduct() {
    return builder.build();
  }
}
