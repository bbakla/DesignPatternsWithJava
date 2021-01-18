package behavioral.state.stateshascontext.states;

import behavioral.state.stateshascontext.Context;

public class LoadedOnTruckState implements State {

  @Override
  public void process(Context context) {
    System.out.printf("Package %s is loaded on Truck. Will be delivered today\n", context.getCity());

    if(isDelivered()) {
      context.updateState(new DeliveredState());
    } else {
      context.updateState(new TryAgainState());
    }
  }

  private boolean isDelivered() {
    return true;
  }
}
