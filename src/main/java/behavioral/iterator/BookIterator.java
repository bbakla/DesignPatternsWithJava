package behavioral.iterator;

import java.util.Iterator;

public class BookIterator implements Iterator<Book> {

  private Book[] books;
  private int currentBookIndex;

  public BookIterator(Book[] books) {
    this.books = books;
  }

  @Override
  public boolean hasNext() {
    return (currentBookIndex < books.length && books[currentBookIndex] != null );
  }

  @Override
  public Book next() {
    return books[currentBookIndex++];
  }
}
