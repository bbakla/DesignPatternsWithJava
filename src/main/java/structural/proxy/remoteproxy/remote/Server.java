package structural.proxy.remoteproxy.remote;

import java.util.HashMap;
import java.util.Map;

public class Server {

  private Map<String, Item> items = new HashMap<>();

  public Server() {
    System.out.println("Server is being created...");
    operate(3000);

  }

  public void connect() {
    System.out.println("Connecting to server...");
    operate(2000);
  }

  public Item download(String name) {
    System.out.printf("Downloading the picture %s from the server\n", name);

    operate(1500);
    return items.get(name);
  }

  public void upload(String name, Item item) {
    System.out.printf("Uploading the picture %s to the server\n", name);

    operate(1500);
    items.put(name, item);
  }

  private void operate(long milis) {
    try {
      Thread.sleep(milis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
