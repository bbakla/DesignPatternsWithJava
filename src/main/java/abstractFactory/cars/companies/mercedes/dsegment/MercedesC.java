package abstractFactory.cars.companies.mercedes.dsegment;


import abstractFactory.cars.companies.mercedes.Mercedes;

public class MercedesC extends Mercedes {

  public MercedesC(String model) {
    super(model);
  }

  @Override
  public String toString() {
    return super.toString() +" C-segment car: MercedesC-Class";
  }

}
