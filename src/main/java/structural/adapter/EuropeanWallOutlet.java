package structural.adapter;

//adaptee
public class EuropeanWallOutlet {

  public void plug(EuropeanPlug plug) {
    plug.get220VoltPower();
  }

  public void giveElectricity() {
    System.out.println("220 Volt is being given to the socket");
  }

}
