package builderPattern.classical;

import builderPattern.classical.builder.Builder;
import builderPattern.classical.builder.CarBuilder;
import builderPattern.classical.builder.MotorbikeBuilder;
import builderPattern.classical.product.MotorBike;

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
