package builderPattern.withinnerclass;

public class Main {

  public static void main(String[] args) {
    UserAccount userAccount = new UserAccount.Builder()
        .setAge(40)
        .setCity("Nürnberg")
        .setSurname("Baba")
        .setName("Ali")
        .setDepartment("Storytelling")
        .build();

    System.out.println(userAccount.toString());

  }

}
