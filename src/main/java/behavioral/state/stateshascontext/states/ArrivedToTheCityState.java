package behavioral.state.stateshascontext.states;

import behavioral.state.stateshascontext.Context;

public class ArrivedToTheCityState implements State {

  @Override
  public void process(Context context) {
    System.out.printf("%s has arrived to the city %s\n", context.getPackageId(), context.getCity());

    context.updateState(new LoadedOnTruckState());
  }
}
