package command;

import receiver.TV;

public class TurnOffTVCommand implements Command{

    TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }

    public void undo() {
        tv.turnOn();
    }
}
