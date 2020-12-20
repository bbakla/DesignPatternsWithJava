package creational.builderPattern.classical.builder;

import creational.builderPattern.classical.product.Product;

public interface Builder {

  Builder addWheels();
  Builder addBody();
  Product build();
}
