package structural.flyweight.flyweights;

public enum ConsumeRate {
  LITTLE(1),
  OK(2),
  A_LOT(3);

  private final int consumeRate;

  private ConsumeRate(int consumeRate) {
    this.consumeRate = consumeRate;
  }

  public int getConsumeRate() {
    return consumeRate;
  }
}
