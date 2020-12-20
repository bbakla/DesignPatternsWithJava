package creational.factoryMethod.computerfactory.factory;

import creational.factoryMethod.computerfactory.computer.Compute;
import creational.factoryMethod.computerfactory.computer.OperatingSystem;

public interface Creator {

  public Compute produce(String type, String ram, String hdd, String cpu, OperatingSystem operatingSystem);

}
