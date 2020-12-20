package creational.builderPattern.classical.builder;

import creational.builderPattern.classical.product.Product;
import creational.builderPattern.classical.product.MotorBike;
import creational.builderPattern.classical.product.components.MotorbikeBody;
import creational.builderPattern.classical.product.components.MotorbikeWheel;

public class MotorbikeBuilder implements Builder {
  
  private Product motorBike;
  
  public MotorbikeBuilder(String name) {
    this.motorBike = new MotorBike(name);
  }

  @Override
  public Builder addWheels() {
    motorBike.add(new MotorbikeWheel("Continental"));

    return this;
  }

  @Override
  public Builder addBody() {
    motorBike.add(new MotorbikeBody("harley"));

    return this;
  }

  @Override
  public Product build() {

    return motorBike;
  }
}
