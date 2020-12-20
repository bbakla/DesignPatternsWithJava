package builderPattern.classical.builder;

import builderPattern.classical.product.Product;

public interface Builder {

  Builder addWheels();
  Builder addBody();
  Product build();
}
