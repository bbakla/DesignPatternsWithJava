package behavioral.visitor;

public interface Visitor {
  public void visit(Book book);
  public void visit(CD cd);
}
