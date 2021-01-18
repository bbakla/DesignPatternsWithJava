package behavioral.strategy.classic.strategies;

public class HybridStrategy implements Strategy {

  @Override
  public void operate() {
    System.out.println("Switching to Hybrid mode");
  }
}
