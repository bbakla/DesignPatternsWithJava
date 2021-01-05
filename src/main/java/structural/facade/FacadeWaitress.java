package structural.facade;

import structural.facade.subsystems.cachier.Cachier;
import structural.facade.subsystems.kitchen.KitchenFacade;

public class FacadeWaitress {

  private KitchenFacade kitchenFacade = new KitchenFacade();
  private Cachier cachier = new Cachier();

  public String orderFood(String foodName, String tableName) {
    System.out.printf("Food %s is being ordered to be cooked\n", foodName);

    cachier.saveOrder(foodName, tableName);
    return kitchenFacade.cook(foodName);
  }

  public double getReceipt(String tableName) {
    System.out.printf("\nGetting the receipt for table %s\n", tableName);

    return cachier.pay(tableName);
  }

}
