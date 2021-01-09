package behavioral.command.receivers;

public class Light implements Component {

  private String state = "off";

  public void turnOn() {
    System.out.println("Turning on the lights");
    state = "on";
  }

  public void turnoff() {
    System.out.println("Turning off the lights");

    state = "off";
  }

  @Override
  public String getState() {
    return state;
  }
}
