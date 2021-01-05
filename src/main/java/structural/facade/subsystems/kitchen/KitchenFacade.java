package structural.facade.subsystems.kitchen;

public class KitchenFacade {
  private Cook cook = new Cook();

  public String cook(String food) {
    cook.getNewOrder(food);

    return cook.cookFood();
  }

}
