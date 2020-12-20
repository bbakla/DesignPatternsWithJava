package creational.factoryMethod.savingfactory.bank.accounts.owners;

public interface OwnerStrategy {
  boolean isForeign();
  String location();
  int fee();

}
