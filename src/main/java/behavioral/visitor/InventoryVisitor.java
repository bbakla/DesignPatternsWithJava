package behavioral.visitor;

public class InventoryVisitor implements Visitor {

  @Override
  public void visit(Book book) {
    System.out.printf("Name of the is %s. Quantity is %.2d and will be updated to %.2d\n",
        book.getName(), book.getQuantity(), getBookInventory());

        book.setQuantity(getBookInventory());
  }

  @Override
  public void visit(CD cd) {
    System.out.printf("Name of the is %s. Quantity is %.2d and will be updated to %.2d\n",
        cd.getName(), cd.getQuantity(), getBookInventory());

    cd.setQuantity(getCDInventory());
  }

  private int getBookInventory(){
    return 5;
  }

  private int getCDInventory(){
    return 4;
  }
}
