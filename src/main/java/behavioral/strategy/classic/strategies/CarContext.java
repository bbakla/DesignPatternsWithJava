package behavioral.strategy.classic.strategies;

import behavioral.strategy.classic.strategies.Strategy;

public class CarContext {

  private Strategy oilConsumption;

  public CarContext() {
  }

  public void execute(Strategy oilConsumption) {
    System.out.println("Car is moving");
    this.oilConsumption = oilConsumption;

    this.oilConsumption.operate();
  }

  public void dealWithGears() {

  }
}
