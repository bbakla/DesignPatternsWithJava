package behavioral.state.stateshascontext.states;

import behavioral.state.stateshascontext.Context;

public class ShippedState implements State {

  @Override
  public void process(Context context) {
    System.out.printf("Package %s is shipped\n", context.getPackageId());
    context.updateState(new ProcessedInParselCenterState());
  }
}
