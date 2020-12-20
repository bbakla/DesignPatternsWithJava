package factoryMethod.savingfactory.bank.accounts.owners;

public enum Owners implements OwnerStrategy {

  DOMESTIC(false, 0, "domestic"),
  FOREIGN(true, 500, "foreign");

  private boolean isForeign;
  private int fee;
  private String location;

  Owners(boolean isForeign, int fee, String location) {
    this.isForeign = isForeign;
    this.fee = fee;
    this.location = location;
  }

  @Override
  public boolean isForeign() {
    return isForeign;
  }

  @Override
  public String location() {
    return location;
  }

  @Override
  public int fee() {
    return fee;
  }
}
