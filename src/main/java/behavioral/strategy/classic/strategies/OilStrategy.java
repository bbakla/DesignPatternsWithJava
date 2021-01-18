package behavioral.strategy.classic.strategies;

public class OilStrategy  implements Strategy{

  @Override
  public void operate() {
    System.out.println("Switching to oil mode");
  }

}
