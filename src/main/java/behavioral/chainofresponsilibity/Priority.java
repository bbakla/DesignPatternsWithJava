package behavioral.chainofresponsilibity;

public enum Priority {
  DEBUG(0), INFO(1), WARNING(2), FATAL(3);

  private final int prio;

  Priority(int prio) {
    this.prio = prio;
  }

  public int getPrio() {
    return  this.prio;
  }





}
