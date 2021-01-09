package behavioral.command.commands;

import behavioral.command.receivers.Gear;

public class DecreaseGearCommand implements Command {

  private Gear gear;

  public DecreaseGearCommand(Gear gear) {
    this.gear = gear;
  }

  @Override
  public void execute() {
    gear.decrease();
  }
}
