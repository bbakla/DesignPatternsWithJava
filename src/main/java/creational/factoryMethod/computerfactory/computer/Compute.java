package creational.factoryMethod.computerfactory.computer;

public interface Compute {

  String getRAM();
  String getHDD();
  String getCPU();
  OperatingSystem getOperatingSystem();

  public void turnOn();
  public void turnOff();

}
