package structural.proxy.remoteproxy;

import java.util.HashMap;
import java.util.Map;

public interface Service {
  public void upload(Picture picture);
  public Picture get(String name);
}
