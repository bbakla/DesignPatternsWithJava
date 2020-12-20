package factoryMethod.computerfactory.factory;

import computerfactory.computer.Compute;
import computerfactory.computer.OperatingSystem;

public interface Creator {

  public Compute produce(String type, String ram, String hdd, String cpu, OperatingSystem operatingSystem);

}
