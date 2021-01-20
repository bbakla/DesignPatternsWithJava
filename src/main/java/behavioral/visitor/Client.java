package behavioral.visitor;

public class Client {

  public static void main(String[] args) {
    var priceVisitor = new PriceVisiter(3.0, 2.0);
    var inventoryVisitor = new InventoryVisitor();

    var book = new Book("die kleine Prince", 3.0, 50);
    var cd = new CD("FAzil Say", 10.0, 400);

    book.accept(priceVisitor);
    cd.accept(priceVisitor);

    System.out.println("-------------------------");

    book.accept(inventoryVisitor);
    cd.accept(priceVisitor);
  }

}
