package creational.singleton.database;

/*
This solution avoids the expense if synchronized keyword and still enables lazy initialization.
* */
public class Database2 {
  private static Database2 database;

  private Database2(){}

  public static Database2 getInstance(String schemaName) {
    return Database2Instance.database2;
  }


  private static class Database2Instance {
    private static Database2 database2 = new Database2();
  }
}


