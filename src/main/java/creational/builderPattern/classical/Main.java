package creational.builderPattern.classical;

import creational.builderPattern.classical.builder.Builder;
import creational.builderPattern.classical.builder.CarBuilder;
import creational.builderPattern.classical.builder.MotorbikeBuilder;

public class Main {

  public static void main(String[] args) {

    Builder builder = new CarBuilder("BMW");
    var director = new Director(builder);
    director.Construct();

    Builder motorBikeBuilder = new MotorbikeBuilder("Harley");
    director.changeBuilder(motorBikeBuilder);
    director.Construct();
  }

}
