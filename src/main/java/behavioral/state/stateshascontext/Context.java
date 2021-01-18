package behavioral.state.stateshascontext;

import behavioral.state.stateshascontext.states.State;

public class Context {
  private State state;
  private PackageDetails shippingPackage;

  public Context(State state, PackageDetails shippingPackage) {
    this.state = state;
    this.shippingPackage = shippingPackage;
  }

  public void updateState(State state) {
    this.state = state;
    process();
  }

  public String getPackageId() {
    return shippingPackage.getPackageId();
  }

  public String getCity() {
    return shippingPackage.getCity();
  }

  public void process() {
    this.state.process(this);
  }
}
