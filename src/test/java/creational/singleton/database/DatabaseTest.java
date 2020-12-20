package creational.singleton.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

  @Test
  public void shouldReturnTheSameInstanceWhenCalledMultipleTimes() {
    var database = Database.getDatabase("test");
    var database2 = Database.getDatabase();

    Assertions.assertEquals(database, database2);

  }

}
