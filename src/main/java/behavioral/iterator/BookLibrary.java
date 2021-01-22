package behavioral.iterator;

import static java.lang.Thread.sleep;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

//ConcreteCollection class
public class BookLibrary implements BookIterable<Book> {
  protected List<Book> books;

  public BookLibrary() {
    super();
    books = new ArrayList<Book>();
  }

  public boolean addBook(String language, String title, String author, long ISBN, double price) {
    Book book = new Book(language, title, author, ISBN, price);
    return books.add(book);
  }

  public boolean addBook(Book book) {
    return books.add(book);
  }

  public Book[] getBooks() {
    System.out.println("Getting the list of books in the library");
    waitForBooks();

    return (Book[]) books.toArray();
  }

  @Override
  public Iterator<Book> iterator() {
    return books.iterator();
  }

  private void waitForBooks() {
    new Thread(() -> {
      try {
        sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
  }
}
