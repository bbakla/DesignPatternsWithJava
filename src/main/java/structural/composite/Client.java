package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Client {

  private List<Employee> employees;

  public Client(List employees) {
    this.employees = employees;
  }

  public void getDetails() {
    employees.forEach(e -> System.out.printf("\nPrinting %s details:\n%s", e.getRole(), e.getEmployeeDetails()));
  }

}
