package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee {

  private Department department;
  private String name;
  private Role role;

  private List<Employee> employees = new ArrayList<>();

  public Composite(String name, Department department, Role role) {
    this.name = name;
    this.department = department;
    this.role = role;
  }

  @Override
  public Department getDepartment() {
    return department;
  }

  @Override
  public Role getRole() {
    return  this.role;
  }

  @Override
  public String getEmployeeDetails() {
    var childrenDetails = new StringBuilder();
    employees.forEach(c -> childrenDetails.append(c.getEmployeeDetails()));

    return String.format("Name:%s\tDepartment:%s\tRole:%s\nEmployeeDetails:\n%s", this.name, this.department, this.role, childrenDetails);
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public void removeEmployee(Employee employee) {
    employees.removeIf(a -> a.getDepartment().equals(employee.getEmployeeDetails()));
  }
}
