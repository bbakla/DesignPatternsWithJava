package structural.proxy.remoteproxy;

import structural.proxy.remoteproxy.remote.Server;

public class PictureService implements Service {

  private Server server;


  @Override
  public void upload(Picture picture) {
   callServer();

    server.connect();
    server.upload(picture.getName(), picture);
  }

  @Override
  public Picture get(String name) {
    callServer();

    server.connect();
    var item = server.download(name);

    var picture = new Picture(item.getName(), item.getDescription());
    picture.setContent(item.getContent());

    return picture;
  }

  private void callServer(){
    if (this.server == null) {
      this.server = new Server();
    }
  }
}
