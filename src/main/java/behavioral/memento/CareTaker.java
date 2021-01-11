package behavioral.memento;

public class CareTaker {
  private Object memento;
  private Car car;

  public CareTaker(Car car) {
    this.car = car;
  }

  public void takeSnapshot() {
    this.memento = car.createSnapshot();
  }

  public void restoreState() {
    this.car.getSnapshot(memento);
  }

}
