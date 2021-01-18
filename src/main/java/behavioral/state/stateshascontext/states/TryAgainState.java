package behavioral.state.stateshascontext.states;

import behavioral.state.stateshascontext.Context;

public class TryAgainState implements State {

  @Override
  public void process(Context context) {
    System.out.printf("Trying to deliver the package again.\n", context.getPackageId());

    if (isDelivered()) {
      context.updateState(new DeliveredState());
    } else {
      context.updateState(new SendBackState());
    }
  }

  private boolean isDelivered() {
    return true;
  }
}
