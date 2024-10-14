package command;

import receiver.AirConditioner;

public class TurnOnACCommand implements Command{

    AirConditioner ac;

    public TurnOnACCommand(AirConditioner ac) {
        this.ac = ac;

    }

    public void execute() {
        ac.turOn();
    }

    public void undo() {
        ac.turnOff();
    }
}
