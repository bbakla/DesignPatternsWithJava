package behavioral.state.stateshascontext;

import behavioral.state.stateshascontext.states.ShippedState;

public class Client {

  public static void main(String[] args) {
    var cargo = new PackageDetails("45660", "Nürnberg");
    var context = new Context(new ShippedState(), cargo);

    context.process();

  }

}
