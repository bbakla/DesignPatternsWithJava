package creational.builderPattern.classical.builder;

import creational.builderPattern.classical.product.Car;
import creational.builderPattern.classical.product.components.CarBody;
import creational.builderPattern.classical.product.components.CarWheel;
import creational.builderPattern.classical.product.Product;

public class CarBuilder implements Builder {

  private Product car;

  public CarBuilder(String name) {
    this.car = new Car(name);
  }

  @Override
  public Builder addWheels() {
    car.add(new CarWheel("Pirelli wheel"));

    return this;
  }

  @Override
  public Builder addBody() {
    car.add(new CarBody("sports body"));

    return this;
  }

  @Override
  public Product build() {
    return car;
  }
}
