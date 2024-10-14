package command;

import receiver.AirConditioner;

public class TurnOffACCommand implements Command{

    AirConditioner ac;

    public TurnOffACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.turnOff();
    }

    public void undo() {
        ac.turOn();
    }
}
