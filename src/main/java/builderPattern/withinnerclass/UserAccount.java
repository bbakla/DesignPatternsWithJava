package builderPattern.withinnerclass;

import java.util.UUID;

public class UserAccount {

  private String id;
  private String name;
  private String surname;
  private int age;
  private String department;
  private String city;

  private UserAccount(String id, String name, String surname, int age, String department, String city) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.department = department;
    this.city = city;
  }

  @Override
  public String toString() {
    return String.format("Id:%s\tName:%s\tSurname:%s\tAge:%d\tDepartment:%s\tCity:%s", id, name, surname, age, department, city);
  }

  public static class Builder {
    private String name;
    private String surname;
    private int age;
    private String department;
    private String city;

    public Builder setName(String name) {
      this.name = name;

      return this;
    }

    public Builder setSurname(String surname) {
      this.surname = surname;

      return this;
    }

    public Builder setAge(int age) {
      this.age = age;

      return this;
    }

    public Builder setDepartment(String department) {
      this.department = department;

      return this;
    }

    public Builder setCity(String city) {
      this.city = city;

      return this;
    }

    public UserAccount build() {
      var userId = UUID.randomUUID().toString();

      return new UserAccount(userId, name, surname, age, department, city);
    }

  }
}
