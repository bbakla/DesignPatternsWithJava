package creational.singleton.database;
/*
synchronized keyword is added to make the pattern thread safe.
* */
public class Database {
  private static Database database;
  private static String schemaName;

  private Database(String schemaName) {
    this.schemaName = schemaName;
  }

  public static synchronized Database getDatabase(String schemaName) {
    if(database == null) {
      database = new Database(schemaName);
    }

    reconfigureDatabase(schemaName);
    return database;
  }

  public static Database getDatabase() {
    if(database == null) {
      throw new IllegalArgumentException("There is no schema name");
    }

    return getDatabase(schemaName);
  }

  private static  void reconfigureDatabase(String schema) {
    schemaName = schema;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if(this==o)
      return true;

    if(o==null||getClass()!=o.getClass())
      return false;

    Database that = (Database) o;
    if(that.getSchemaName().equalsIgnoreCase(this.getSchemaName())) {
      return true;
    }

    return false;
  }
}
