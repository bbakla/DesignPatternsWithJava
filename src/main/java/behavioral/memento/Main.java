package behavioral.memento;

public class Main {

  public static void main(String[] args) {

    var originator = new Car(100, 50);
    originator.increase();
    var careTaker = new CareTaker(originator);

    originator.increase();
    System.out.printf("The car is %s\n", originator);

    careTaker.takeSnapshot();
    originator.increase();
    originator.increase();
    originator.increase();
    System.out.printf("The car is %s\n", originator);

    careTaker.restoreState();
    System.out.printf("The car is %s\n", originator);
  }

}
