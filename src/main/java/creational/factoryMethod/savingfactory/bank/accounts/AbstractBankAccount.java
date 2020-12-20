package creational.factoryMethod.savingfactory.bank.accounts;

import creational.factoryMethod.savingfactory.bank.accounts.owners.OwnerStrategy;
import creational.factoryMethod.savingfactory.bank.accounts.owners.Owners;

public abstract class AbstractBankAccount implements  BankAccount {
  protected int accountNumber;
  protected int balance;
  protected OwnerStrategy owner = Owners.DOMESTIC;

  protected AbstractBankAccount(int acctnum) {
    this.accountNumber = acctnum;
  }

  @Override
  public int getAccountNumber() {
    return accountNumber;
  }

  @Override
  public int getBalance() {
    return balance;
  }

  @Override
  public void deposit(int amount) {
    balance += amount;
  }

  @Override
  public boolean isForeign() {
    return owner.isForeign();
  }

  @Override
  public void setForeign(boolean isForeign) {
    owner = isForeign ? Owners.FOREIGN : Owners.DOMESTIC;
  }

  @Override
  public boolean hasEnoughCollateral(int loanAmount) {
    double ratio = collateralRatio();

    return balance >= loanAmount * ratio;
  }

  @Override
  public void addInterest() {
    balance += (int) (balance * interestRate());
  }

  @Override
  public int fee() {
    return owner.fee();
  }

  @Override
  public int compareTo(BankAccount o) {
    int balance1 = getBalance();
    int balance2 = o.getBalance();

    if (balance1 == balance2) {
      return getAccountNumber() - o.getAccountNumber();
    } else {
      return balance1 - balance2;
    }
  }

  @Override
  public String toString() {
    String accountType = accountType();
    return accountType + "account " + accountNumber + ": balance=" + balance
        + ", is " + owner.location()
        + ", fee=" + fee();
  }

  @Override
  public boolean equals(Object obj) {
    if (! (obj instanceof BankAccount)) {
      return false;
    }

    BankAccount ba = (BankAccount) obj;
    return getAccountNumber() == ba.getAccountNumber();
  }

  protected abstract double collateralRatio();
  protected abstract String accountType();
  protected abstract double interestRate();

}
