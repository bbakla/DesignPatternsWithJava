package behavioral.command.commands;

import behavioral.command.receivers.Light;

public class TurnOffLightCommand implements  Command {

  private Light light;

  public TurnOffLightCommand(Light light) {
    this.light = light;
  }


  @Override
  public void execute() {
    light.turnoff();
  }
}
