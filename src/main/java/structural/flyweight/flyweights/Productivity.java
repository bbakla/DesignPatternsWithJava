package structural.flyweight.flyweights;

public enum Productivity {
  BAD(0),
  OK(3),
  GOOD(5);

  private final int productivityPoint;

  private Productivity(int productivityPoint) {
    this.productivityPoint = productivityPoint;
  }

  public int getProductivityPoint() {
    return productivityPoint;
  }
}
