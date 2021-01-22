package behavioral.iterator;

import static java.lang.Thread.sleep;

import java.util.Iterator;

//ConcreteCollection class
public class BookStore implements BookIterable<Book> {
  private static int MAX_BOOKS = 1000;
  private int totalBooks = 0;
  private Book[] books;

  public BookStore() {
    super();
    books = new Book[MAX_BOOKS];
  }

  public boolean addBook(String language, String title, String author, long ISBN, double price) {
    Book book = new Book(language, title, author, ISBN, price);
    if (totalBooks < (MAX_BOOKS - 1)) {
      books[totalBooks++] = book;
      return true;
    } else {
      System.out.println("BookStore is full and can't accept any more books!");
      return false;
    }
  }

  public boolean addBook(Book book) {
    if (totalBooks < (MAX_BOOKS - 1)) {
      books[totalBooks++] = book;
      return true;
    } else {
      System.out.println("BookStore is full and can't accept any more books!");
      return false;
    }
  }

  public Book[] getBooks() {
    System.out.println("Asking the list of books from the store");
    waitForBooks();
    return books;
  }

  @Override
  public Iterator<Book> iterator() {
    return new BookIterator(this.getBooks());
  }

  private void waitForBooks() {
    new Thread(() -> {
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
  }
}
