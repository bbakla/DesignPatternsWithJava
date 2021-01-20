package behavioral.visitor;

public class CD implements Visitable  {
  private String name;
  private double price;
  private int quantity;

  public CD(String albumName, double price, int quantity) {
    this.name = albumName;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
