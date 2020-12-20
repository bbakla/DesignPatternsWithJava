package creational.abstractFactory.cars.companies.mercedes.csegment;

import creational.abstractFactory.cars.companies.mercedes.Mercedes;

public class MercedesA extends Mercedes {

  public MercedesA(String model) {
    super(model);
  }

  @Override
  public String toString() {
    return super.toString() +" C-segment car: MercedesA-Class";
  }

}
