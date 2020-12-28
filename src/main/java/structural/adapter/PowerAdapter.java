package structural.adapter;

public class PowerAdapter implements USACPlug {

  private EuropeanWallOutlet wallOutlet;

  public PowerAdapter(EuropeanWallOutlet wallOutlet) {
    this.wallOutlet = wallOutlet;
  }

  @Override
  public void get120Volt() {
    wallOutlet.plug(new EuropeanPlug());
    wallOutlet.giveElectricity();
  }
}
