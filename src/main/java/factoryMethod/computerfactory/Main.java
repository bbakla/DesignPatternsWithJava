package factoryMethod.computerfactory;

import computerfactory.computer.Compute;
import computerfactory.computer.OperatingSystem;
import computerfactory.factory.ComputerFactory;
import computerfactory.factory.Creator;

public class Main {

  public static void main(String[] args) {
    Creator computerFactory = new ComputerFactory();

    Compute computer1 = computerFactory.produce("pc", "256", "500", "399", OperatingSystem.WINDOWS);
    Compute computer2 = computerFactory.produce("cloud", "256", "500", "399", OperatingSystem.WINDOWS);

    computer1.turnOn();
    computer2.turnOn();
  }

}
