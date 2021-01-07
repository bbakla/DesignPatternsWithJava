package structural.flyweight;

import structural.flyweight.context.Country;
import structural.flyweight.context.PersonType;
import structural.flyweight.flyweights.AgeInterval;

public class Client {

  public static void main(String[] args) {
    Country turkey = new Country("Turkey", 1, 0.8);
    turkey.createPerson(PersonType.FARMER, AgeInterval.YOUNG);
    turkey.createPerson(PersonType.SOLDIER,AgeInterval.YOUNG);
    turkey.createPerson(PersonType.SOLDIER, AgeInterval.OLD);

    var germany = new Country("Germany", 2, 0.5);
    germany.createPerson(PersonType.FARMER, AgeInterval.YOUNG);
    germany.createPerson(PersonType.FARMER, AgeInterval.YOUNG);
    germany.createPerson(PersonType.FARMER, AgeInterval.YOUNG);
    germany.createPerson(PersonType.FARMER, AgeInterval.OLD);
    germany.createPerson(PersonType.SOLDIER, AgeInterval.YOUNG);

    System.out.println(turkey.production());
    System.out.println(turkey.consumption());
    System.out.println(turkey.getNumberOfFarmers());
    System.out.println(turkey.getNumberOfSoldiers());

    System.out.printf("GNP of %s is %.2f\n", turkey.getCountry(), turkey.getGNP());
    System.out.printf("GNP of %s is %.2f\n", germany.getCountry(), germany.getGNP());
  }

}
