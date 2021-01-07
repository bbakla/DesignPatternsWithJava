package structural.proxy.remoteproxy.remote;

import java.awt.image.BufferedImage;

public interface Item {

  public byte[] getContent();
  public void setContent(byte[] content);
  public String getName();
  public void setName(String name);
  public String getDescription();
  public void setDescription(String description);

}
