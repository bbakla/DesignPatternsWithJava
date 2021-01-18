package behavioral.strategy.classic.strategies;

public class ElectricStrategy  implements Strategy{

  @Override
  public void operate() {
System.out.println("Switching to e-car mode");
  }

}
