package behavioral.command;

import behavioral.command.commands.Command;
import java.util.ArrayList;
import java.util.List;

public class Invoker {
  private List<Command> commandHistory = new ArrayList<>();

  public void execute(Command command, boolean addToHistory) {
    if(addToHistory) {
      commandHistory.add(command);
    }

    command.execute();
  }

}
