package factoryMethod.savingfactory.bank.accounts;

public class SavingsAccount extends CheckingAccount {

  public SavingsAccount(int acctnum) {
    super(acctnum);
  }

  protected String accountType() {
    return "Regular checking";
  }

  protected double interestRate() {
    return 0.0;
  }

  protected double collateralRatio() {
    return 1.0 / 2.0;
  }
}