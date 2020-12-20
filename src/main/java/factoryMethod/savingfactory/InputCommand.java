package factoryMethod.savingfactory;

import java.util.Scanner;
import factoryMethod.savingfactory.bank.branch.Bank;

public interface InputCommand {
  int execute(Scanner sc, Bank bank, int current);
}