package behavioral.command.receivers;


public class Gear implements Component {

  private int gear;
  public void decrease() {
    if (gear > 0) {
      System.out.println("Decreasing the gear");
      gear--;
    } else {
      System.out.println("cant decrease anymore");
    }
  }

  public void increase() {
    if (gear < 5) {
      gear++;

      System.out.println("Increasing the gear");
    } else {
      System.out.println("Cant increase anymore");
    }
  }

  public void declutch() {
    System.out.println("Decluching the gear");
    gear = 0;
  }

  @Override
  public String getState() {
    return Integer.toString(this.gear);
  }
}
