package behavioral.memento;

public class Car {
  private int km;
  private int speed;
  private String oil;

  public Car(int km, int speed) {
    this.km = km;
    this.speed = speed;
    oil= "vorhanden";
  }

  public Object createSnapshot() {
    return  new CarStateMemento(speed, km);
  }

  public void increase() {
    this.speed += 25;
    this.km += 2;
  }

  public void getSnapshot(Object snapshot) {
    var s = (CarStateMemento) snapshot;
    this.speed = s.speed;
    this.km = s.km;
  }

  @Override
  public String toString() {
    return "Car{" +
        "km=" + km +
        ", speed=" + speed +
        ", oil='" + oil + '\'' +
        '}';
  }

  private class CarStateMemento {
    private int speed;
    private int km;

    public CarStateMemento(int speed, int km) {
      this.speed = speed;
      this.km = km;
    }
  }
}
