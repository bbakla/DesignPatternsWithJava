package creational.prototypePattern.army.prototypes;

public abstract class Soldier implements Cloneable {

  protected Rank rank;
  private String name;
  private Location location;

  public Soldier(String name) {
    this.name = name;
  }

  public Rank getRank() {
    return rank;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  @Override
  public Soldier clone() throws CloneNotSupportedException {
    return (Soldier) super.clone();
  }

  public abstract void orders();
}
