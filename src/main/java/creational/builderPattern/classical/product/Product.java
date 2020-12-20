package creational.builderPattern.classical.product;

import creational.builderPattern.classical.product.components.Component;

public interface Product {

  void add(Component component);
  String getName();

  void show();
}
