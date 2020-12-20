package builderPattern.classical.product;

import builderPattern.classical.product.components.Component;
import java.util.ArrayList;
import java.util.List;

public interface Product {

  void add(Component component);
  String getName();

  void show();
}
