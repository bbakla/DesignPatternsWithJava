package factoryMethod.savingfactory.bank.accounts;

import factoryMethod.savingfactory.bank.factory.AccountFactories;

public interface BankAccount  extends Comparable<BankAccount>{

  int getAccountNumber();
  int getBalance();
  void deposit(int amount);
  boolean isForeign();
  void setForeign(boolean isForeign);
  boolean hasEnoughCollateral(int loanAmount);
  String toString();
  void addInterest();
  int fee();

  default boolean isEmpty() {
    return getBalance() == 0;
  }

  static BankAccount createSavingsWithDeposit(int accountNumber, int n) {
    BankAccount bankAccount = AccountFactories.SAVINGS.create(accountNumber);
    bankAccount.deposit(n);

    return bankAccount;
  }


}
