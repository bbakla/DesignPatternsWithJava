package behavioral.command.commands;

import behavioral.command.receivers.Engine;
import behavioral.command.receivers.Light;
import java.util.ArrayList;
import java.util.List;

public class StartEngineCommand implements Command {
  private Engine engine;

  public StartEngineCommand(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void execute() {
    engine.stopEngine();
  }

}
