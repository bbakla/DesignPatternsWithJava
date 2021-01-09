package behavioral.command;

import behavioral.command.commands.Command;
import behavioral.command.commands.IncreaseGearCommand;
import behavioral.command.commands.StartEngineCommand;
import behavioral.command.commands.StopEngineCommand;
import behavioral.command.commands.TurnOnLightCommand;
import behavioral.command.receivers.Component;
import behavioral.command.receivers.Engine;
import behavioral.command.receivers.Gear;
import behavioral.command.receivers.Light;

public class Client {

  public static void main(String[] args) {
    var invoker = new Invoker();

    Component engine = new Engine();

    invoker.execute(() -> new StartEngineCommand((Engine) engine) , true);

    System.out.println("------------------------------");

    Component gear = new Gear();
    Command increaseGearCommand = new IncreaseGearCommand((Gear) gear);
    invoker.execute(increaseGearCommand, true);

    System.out.printf("gear state is %s\n", gear.getState());
    invoker.execute(increaseGearCommand, true);
    System.out.printf("gear state is %s\n", gear.getState());

    System.out.println("------------------------------");

    Component light = new Light();
    Command turnOnLightCommand = new TurnOnLightCommand((Light) light);
    invoker.execute(turnOnLightCommand, true);
    System.out.printf("Light state is %s\n", light.getState());

    System.out.println("------------------------------");

    Command stopEngineCommand = new StopEngineCommand((Engine) engine, (Light) light, (Gear) gear);
    invoker.execute(stopEngineCommand, true);
    System.out.printf("State of engine %s\n", engine.getState());
    System.out.printf("State of light %s\n", light.getState());
    System.out.printf("State of gear %s\n", gear.getState());

  }

}
