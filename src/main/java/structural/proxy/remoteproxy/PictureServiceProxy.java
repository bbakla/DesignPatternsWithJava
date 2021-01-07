package structural.proxy.remoteproxy;

import java.util.HashMap;
import java.util.Map;

public class PictureServiceProxy implements Service {

  private PictureService pictureService;
  private Map<String, Picture> cache = new HashMap<>();

  public PictureServiceProxy() {
    this.pictureService = new PictureService();
  }

  @Override
  public void upload(Picture picture) {
    //cache.put(picture.getName(), picture);

    pictureService.upload(picture);
  }

  @Override
  public Picture get(String name) {
    var picture = cache.get(name);

    if(picture == null) {
      picture = pictureService.get(name);
      cache.put(picture.getName(), picture);
      System.out.println("Calling from the server");
    }  else {
      System.out.printf("%s is already in the cache\n", picture.getName());
    }

    return picture;
  }
}
