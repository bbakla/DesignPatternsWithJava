package creational.singleton;

import creational.singleton.database.Database;

public class Main {

  public static void main(String[] args) {

    Database database = Database.getDatabase("firstSchema");
    Database database1 = Database.getDatabase();

    System.out.println(database == database1);

  }

}
