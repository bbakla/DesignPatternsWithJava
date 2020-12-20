package creational.abstractFactory.singleton.client;


import creational.abstractFactory.factory.AbstractCarSegmentFactory;
import creational.abstractFactory.factory.CSegmentCarFactory;
import creational.abstractFactory.factory.DSegmentCarFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {

  public static void main(String[] args) {

    Map<String, AbstractCarSegmentFactory> factorySegmentsMap = new HashMap<>();
    factorySegmentsMap.put("C", new CSegmentCarFactory());
    factorySegmentsMap.put("D", new DSegmentCarFactory());


    String option = "";

    System.out.println("Loading the gallery:");

    while (!option.equals("exit")) {
      System.out.println("Type exit to exit");
      System.out.println("Which segment do you want to display?");

      System.out.println("C-Segment-> Press C");
      System.out.println("D-Segment-> Press D");

      Scanner scanner = new Scanner(System.in);
      String choose = scanner.nextLine();


      switch (choose) {
        case "C":
          var cSegment = factorySegmentsMap.get("C");
          System.out.println(cSegment.getAudi().toString());
          System.out.println(cSegment.getBMW().toString());
          System.out.println(cSegment.getMercedes().toString());
          System.out.println("----------------------------------------");

          break;

        case "D":
          var dSegment = factorySegmentsMap.get("D");
          System.out.println(dSegment.getAudi().toString());
          System.out.println(dSegment.getBMW().toString());
          System.out.println(dSegment.getMercedes().toString());
          System.out.println("----------------------------------------");
          break;

        case "exit":
          option = "exit";
          break;

        default:
          System.out.println("There is no such a segment");
      }

    }
  }
}
