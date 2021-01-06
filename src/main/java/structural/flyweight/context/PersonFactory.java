package structural.flyweight.context;

import java.util.HashMap;
import java.util.Map;
import structural.flyweight.flyweights.AgeInterval;
import structural.flyweight.flyweights.Farmer;
import structural.flyweight.flyweights.Person;
import structural.flyweight.flyweights.Soldier;

public class PersonFactory {

  private static Map<PersonType, Person> personTypeFlyweights=  new HashMap<>();

  public static Person makePerson(PersonType personType, AgeInterval ageInterval) {
    Person flyweight = personTypeFlyweights.get(personType.name());
    if (flyweight != null) {
      return flyweight;
    }

    var newPerson =  createPerson(personType, ageInterval);
    personTypeFlyweights.put(personType, newPerson);

    return newPerson;
  }

  public static Person getFlyWeight(PersonType personType) {
    return personTypeFlyweights.get(personType);
  }

  private static Person createPerson(PersonType personType, AgeInterval ageInterval) {
    if(personType.name().equals(PersonType.FARMER)) {
      return new Farmer(ageInterval);
    }

    return new Soldier(ageInterval);
  }

}
