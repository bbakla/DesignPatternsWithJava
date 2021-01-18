package behavioral.state.stateshascontext.states;

import behavioral.state.stateshascontext.Context;

public class SendBackState implements State {

  @Override
  public void process(Context context) {
    System.out.printf("Package couldnt be delivered. Being sent back\n", context.getPackageId());
  }
}
