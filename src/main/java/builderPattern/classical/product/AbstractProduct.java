package builderPattern.classical.product;

import builderPattern.classical.product.components.Component;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProduct implements Product {

  List<Component> components = new ArrayList<>();

  @Override
  public void show() {
    System.out.printf("\n%s is being built\n", getName());
    components.forEach(i -> System.out.println(i.toString()));
  }
}
