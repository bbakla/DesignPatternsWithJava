package factoryMethod.computerfactory.computer;

public class CloudComputer extends Computer {

  public CloudComputer(String ram, String hdd, String cpu,
      OperatingSystem operatingSystem) {
    super(ram, hdd, cpu, operatingSystem);
  }


  @Override
  public void turnOn() {
    System.out.println("turning on cloud computer");
  }

  @Override
  public void turnOff() {
    System.out.println("turning off cloud computer");
  }
}
