package behavioral.state.stateshascontext.states;

import behavioral.state.stateshascontext.Context;

public class DeliveredState implements State {

  @Override
  public void process(Context context) {
    System.out.printf("The package %s is delivered", context.getPackageId());
  }
}
