package behavioral.state.stateshascontext.states;

import behavioral.state.stateshascontext.Context;

public class ProcessedInParselCenterState implements State {

  @Override
  public void process(Context context) {
    System.out.printf("%s is processed and being sent to the city of arrival\n", context.getPackageId());
    context.updateState(new ArrivedToTheCityState());
  }
}
