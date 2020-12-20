package creational.factoryMethod.savingfactory.bank.factory;


import creational.factoryMethod.savingfactory.bank.accounts.BankAccount;
import creational.factoryMethod.savingfactory.bank.accounts.InterestChecking;
import creational.factoryMethod.savingfactory.bank.accounts.RegularChecking;
import creational.factoryMethod.savingfactory.bank.accounts.SavingsAccount;

public enum AccountFactories implements AccountFactory {

  SAVINGS("Savings", SavingsAccount::new),
  REGULAR_CHECKING("Regular checking", RegularChecking::new),
  INTEREST_CHECKING("Interest checking",
      InterestChecking::new),
  NEW_CUSTOMER("New customer", accountNum -> {
      BankAccount result = new SavingsAccount(accountNum);
      result.deposit(1000);
      return result;
  });

  private String name;
  private AccountFactory af;

  AccountFactories(String name, AccountFactory af) {
    this.name = name;
    this.af = af;
  }

  @Override
  public BankAccount create(int accountNumber) {
    return af.create(accountNumber);
  }

  public String toString() {
    return name;
  }
}
