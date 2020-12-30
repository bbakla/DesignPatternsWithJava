package structural.composite;

import java.util.ArrayList;

/*
This main class is actually not really necessary because it can be combined with Client class. However,
this separation shows clearly that client has no idea about which class it is
* */
public class Main {

  public static void main(String[] args) {
    Employee developer = new Developer("Ali", Department.HR);
    Employee developer2 = new Developer("Jurek", Department.DEVELOPMENT);
    Composite manager = new Composite("Merve", Department.DEVELOPMENT, Role.MANAGER);
    Composite teamLead = new Composite("George", Department.HR, Role.TEAM_LEAD);

    teamLead.addEmployee(developer);
    manager.addEmployee(teamLead);
    manager.addEmployee(developer2);

    var employees = new ArrayList<Employee>() {
      {
        add(developer);
        add(developer2);
        add(manager);
        add(teamLead);
      }
    };

    var client = new Client(employees);
    client.getDetails();

  }

}
