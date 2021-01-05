package structural.facade.subsystems.kitchen;

public class Cook {

  private String foodToCook;
  public void getNewOrder(String food) {
    this.foodToCook = food;
  }

  public String cookFood() {
    return this.foodToCook + " is ready";
  }

}
