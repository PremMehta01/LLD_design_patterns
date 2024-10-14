package command;

import receiver.TV;

public class TurnOnTVCommand implements Command{

    TV tv;

    public TurnOnTVCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }

    public void undo() {
        tv.turnOff();
    }
}
