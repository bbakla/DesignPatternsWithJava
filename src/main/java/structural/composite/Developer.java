package structural.composite;

public class Developer implements Employee {

  private Department department;
  private String name;

  public Developer(String name, Department department) {
    this.name = name;
    this.department = department;
  }

  @Override
  public Department getDepartment() {
    return department;
  }

  @Override
  public Role getRole() {
    return  Role.DEVELOPER;
  }

  @Override
  public String getEmployeeDetails() {
    return String.format("Name:%s\tDepartment:%s\tRole:%s\n", this.name, this.department, Role.DEVELOPER);
  }
}
