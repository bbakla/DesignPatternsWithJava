package structural.flyweight.context;

import java.util.HashMap;
import java.util.Map;
import structural.flyweight.flyweights.AgeInterval;
import structural.flyweight.flyweights.Person;

public class Country {
  private String country;
  private double countryProductionCoefficient;
  private double countryConsumptionCoefficient;

  private Map<PersonType, Integer> residents = new HashMap<>();

  public Country(String country, double countryProductionCoefficient, double countryConsumptionCoefficient) {
    this.country = country;
    this.countryProductionCoefficient = countryProductionCoefficient;
    this.countryConsumptionCoefficient = countryConsumptionCoefficient;
  }

  public Person createPerson(PersonType personType, AgeInterval ageInterval) {
    var person = PersonFactory.makePerson(personType, ageInterval);

    var residentNumber = residents.get(personType);
    var counter = residentNumber;
    if (residentNumber == null) {
      counter = 1;
    } else {
      counter += residentNumber;
    }

    residents.put(personType, counter);

    return person;
  }

  public String getCountry() {
    return country;
  }

  public double production()  {
    var farmerNumber = residents.get(PersonType.FARMER);
    var farmerProductivity = PersonFactory.getFlyWeight(PersonType.FARMER).produce();

    var soldierNumber = residents.get(PersonType.SOLDIER);
    var soldierProductivity = PersonFactory.getFlyWeight(PersonType.SOLDIER).produce();

    return this.countryProductionCoefficient * ((farmerNumber * farmerProductivity) + (soldierNumber * soldierProductivity));
  }

  public double consumption() {
    var farmerNumber = residents.get(PersonType.FARMER);
    var farmerConsumption = PersonFactory.getFlyWeight(PersonType.FARMER).consume();

    var soldierNumber = residents.get(PersonType.SOLDIER);
    var soldierConsumption = PersonFactory.getFlyWeight(PersonType.SOLDIER).consume();

    return this.countryConsumptionCoefficient * ((farmerNumber * farmerConsumption) + (soldierNumber * soldierConsumption));
  }

  public double getGNP () {
    return production() - consumption();
  }

  public int getNumberOfFarmers() {
    return residents.get(PersonType.FARMER);
  }

  public int getNumberOfSoldiers() {
    return residents.get(PersonType.SOLDIER);
  }


}
