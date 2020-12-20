package creational.factoryMethod.savingfactory;

import java.util.Scanner;
import creational.factoryMethod.savingfactory.bank.branch.Bank;

public interface InputCommand {
  int execute(Scanner sc, Bank bank, int current);
}