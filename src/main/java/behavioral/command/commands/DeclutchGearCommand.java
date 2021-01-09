package behavioral.command.commands;

import behavioral.command.receivers.Gear;

public class DeclutchGearCommand implements Command {

  private Gear gear;

  public DeclutchGearCommand(Gear gear) {
    this.gear = gear;
  }

  @Override
  public void execute() {
    gear.declutch();
  }
}
