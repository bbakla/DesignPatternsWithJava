package structural.adapter;

//Client
public class Computer {

  private USACPlug plug;

  public Computer(USACPlug plug) {
    this.plug = plug;
  }

  public void turnOn() {
    plug.get120Volt();
    System.out.println("Computer is starting");
  }

}
