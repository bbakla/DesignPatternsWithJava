package behavioral.iterator;

public interface BookIterable<Book> extends Iterable<Book>{

  public Book[] getBooks();
}
