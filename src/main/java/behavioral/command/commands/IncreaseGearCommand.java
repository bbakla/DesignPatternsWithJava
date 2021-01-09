package behavioral.command.commands;

import behavioral.command.receivers.Gear;

public class IncreaseGearCommand implements Command {
  private Gear gear;

  public IncreaseGearCommand(Gear gear) {
    this.gear = gear;
  }

  @Override
  public void execute() {
    gear.increase();
  }
}
