package behavioral.command.commands;

import behavioral.command.receivers.Engine;
import behavioral.command.receivers.Gear;
import behavioral.command.receivers.Light;
import java.util.ArrayList;
import java.util.List;

public class StopEngineCommand implements Command {

  private Engine engine;

  private List<Command> commandList = new ArrayList<>();

  public StopEngineCommand(Engine engine, Light light, Gear gear) {
    this.engine = engine;
    commandList.add(new TurnOffLightCommand(light));
    commandList.add(new DeclutchGearCommand(gear));
  }

  @Override
  public void execute() {
    engine.stopEngine();
    commandList.forEach(c -> c.execute());
  }
}
