package creational.factoryMethod.computerfactory;

import creational.factoryMethod.computerfactory.computer.Compute;
import creational.factoryMethod.computerfactory.computer.OperatingSystem;
import creational.factoryMethod.computerfactory.factory.ComputerFactory;
import creational.factoryMethod.computerfactory.factory.Creator;

public class Main {

  public static void main(String[] args) {
    Creator computerFactory = new ComputerFactory();

    Compute computer1 = computerFactory.produce("pc", "256", "500", "399", OperatingSystem.WINDOWS);
    Compute computer2 = computerFactory.produce("cloud", "256", "500", "399", OperatingSystem.WINDOWS);

    computer1.turnOn();
    computer2.turnOn();
  }

}
