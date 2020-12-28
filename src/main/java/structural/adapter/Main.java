package structural.adapter;

public class Main {

  public static void main(String[] args) {
    var powerAdapter = new PowerAdapter(new EuropeanWallOutlet());
    Computer computer = new Computer(powerAdapter);

    computer.turnOn();
  }

}
