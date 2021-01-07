package structural.proxy.remoteproxy;

import java.awt.image.BufferedImage;
import structural.proxy.remoteproxy.remote.Item;

/*
In normal world they would talk via an API and Server would expect a json or xml.
But for simplicity picture implements item class here.
*/

public class Picture implements Item {
  private String name;
  private String description;
  private byte[] content;

  public Picture(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
