package structural.proxy.remoteproxy;

public class Client {

  public static void main(String[] args) {

    Service service = new PictureServiceProxy();

    Picture picture = new Picture("picture1", "desc1");
    Picture picture2 = new Picture("picture2", "desc2");

    service.upload(picture);
    service.upload(picture2);

    service.get(picture.getName());
    service.get(picture.getName());
  }

}


