package behavioral.visitor;

public class Book implements Visitable  {
  private String name;
  private double price;
  private int quantity;

  public Book(String name, double price, int quantity) {
    this.name = name;
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

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
