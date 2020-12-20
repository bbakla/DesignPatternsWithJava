package creational.factoryMethod.savingfactory.bank.factory;


import creational.factoryMethod.savingfactory.bank.accounts.BankAccount;

public interface AccountFactory {
BankAccount create(int accountNumber);

AccountFactory[] factories = AccountFactories.values();

static BankAccount createAccount(int type, int accountNumber) {
  AccountFactory accountFactory = factories[type - 1];
  return accountFactory.create(accountNumber);
}

}
