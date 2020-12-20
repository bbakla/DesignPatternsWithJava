package creational.factoryMethod.computerfactory.computer;

public class PC extends Computer {

  public PC(String ram, String hdd, String cpu,
      OperatingSystem operatingSystem) {
    super(ram, hdd, cpu, operatingSystem);
  }


  @Override
  public void turnOn() {
    System.out.println("turning on PC");
  }

  @Override
  public void turnOff() {
    System.out.println("turning off PC");
  }
}
