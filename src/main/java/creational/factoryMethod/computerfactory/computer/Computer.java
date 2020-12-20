package creational.factoryMethod.computerfactory.computer;

public abstract class Computer implements Compute {

  private String ram;
  private String hdd;
  private String cpu;
  private OperatingSystem operatingSystem;

  public Computer(String ram, String hdd, String cpu,
      OperatingSystem operatingSystem) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
    this.operatingSystem = operatingSystem;
  }


  @Override
  public String getRAM() {
    return ram;
  }

  @Override
  public String getHDD() {
    return hdd;
  }

  @Override
  public String getCPU() {
    return cpu;
  }

  @Override
  public OperatingSystem getOperatingSystem() {
    return operatingSystem;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  public void setHdd(String hdd) {
    this.hdd = hdd;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public void setOperatingSystem(OperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
  }
}
