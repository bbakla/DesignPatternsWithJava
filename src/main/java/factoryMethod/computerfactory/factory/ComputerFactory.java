package factoryMethod.computerfactory.factory;

import computerfactory.computer.CloudComputer;
import computerfactory.computer.Compute;
import computerfactory.computer.OperatingSystem;
import computerfactory.computer.PC;

public class ComputerFactory implements Creator {

  @Override
  public Compute produce(String type, String ram, String hdd, String cpu, OperatingSystem operatingSystem) {

    switch (type.toLowerCase()) {
      case "pc":
        return new PC(ram, hdd, cpu, operatingSystem);
      case "cloud":
        return new CloudComputer(ram, hdd, cpu, operatingSystem);
      default:
        throw new IllegalArgumentException("There is no such a computing type");
    }
  }


}
