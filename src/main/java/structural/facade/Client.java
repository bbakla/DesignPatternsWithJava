package structural.facade;

import structural.facade.subsystems.kitchen.KitchenFacade;

public class Client {

  public static void main(String[] args) {
    var facade = new FacadeWaitress();

    facade.orderFood("karniyarik", "table1");
    facade.orderFood("ayran", "table1");
    facade.orderFood("Coffee", "table2");

    System.out.printf("Payment of table1 is %s\n", facade.getReceipt("table1"));
    System.out.printf("Payment of table2 is %s\n", facade.getReceipt("table2"));
  }

}
