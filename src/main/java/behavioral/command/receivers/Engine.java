package behavioral.command.receivers;

public class Engine implements Component {

  private String state = "off";

  public void start() {
    System.out.println("Starting the engine");
    state = "on";
  }

  public void stopEngine() {
    System.out.println("Stopping the engine");

    state = "off";
  }

  @Override
  public String getState() {
    return this.state;
  }
}
