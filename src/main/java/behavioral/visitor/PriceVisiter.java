package behavioral.visitor;

public class PriceVisiter implements Visitor {

  private double bookIncreaseRate;
  private double cDIncreaseRate;


  public PriceVisiter(double bookIncreaseRate, double cDIncreaseRate) {
    this.bookIncreaseRate = bookIncreaseRate;
    this.cDIncreaseRate = cDIncreaseRate;
  }

  @Override
  public void visit(Book book) {
    var newPrice = book.getPrice() * bookIncreaseRate;
    System.out.printf("Name of the is %s. Price is %.2f and will be updated to %.2f\n",
        book.getName(), book.getPrice(), newPrice);

        book.setPrice(newPrice);
  }

  @Override
  public void visit(CD cd) {
    var newPrice = cd.getPrice() * cDIncreaseRate;
    System.out.printf("Name of the is %s. Price is %.2f and will be updated to %.2f\n",
        cd.getName(), cd.getPrice(), newPrice);

    cd.setPrice(newPrice);
  }
}
