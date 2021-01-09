package playground;

public class Main {

  public static void main(String[] args) {
    var c = new Sample();
    c.doIt();
  }

}

class Sample {

  static int a = 2;
  int b = 5;

  //static initializer
  static
  {
    System.out.println("first static initializer block should be called");
    a =9;
  }

  //initializer block is added
  {
    b = 14;
    a = 5;
    System.out.println("initializer block should be called before construction");
  }

  Sample()
  {
    System.out.println("public Constructor should be called after initializer blocks");
  }

  public void doIt()
  {
    System.out.println("doing it");
  }
}

