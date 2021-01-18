package behavioral.strategy.classic.strategies;

public class Client {

  public static void main(String[] args) {
    var car = new CarContext();
    car.execute(new ElectricStrategy());
    car.execute(new HybridStrategy());
  }

}
