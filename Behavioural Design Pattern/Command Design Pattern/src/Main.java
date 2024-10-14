import command.*;
import invoker.Remote;
import receiver.AirConditioner;
import receiver.TV;

public class Main {
    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();
        TV tv = new TV();

        Remote remote = new Remote();

        Command acTurnOnCommand = new TurnOnACCommand(ac);
        Command acTurnOffCommand = new TurnOffACCommand(ac);

        Command tvTurnOnCommand = new TurnOnTVCommand(tv);
        Command tvTurnOffCommand = new TurnOffTVCommand(tv);


        remote.setCommand(acTurnOnCommand);
        remote.pressButton();
//        remote.undoPress();

        remote.setCommand(acTurnOffCommand);
        remote.pressButton();
//        remote.undoPress();

        remote.setCommand(tvTurnOnCommand);
        remote.pressButton();
//        remote.undoPress();

        remote.setCommand(tvTurnOffCommand);
        remote.pressButton();
//        remote.undoPress();


        //////////////
        System.out.println();
        System.out.println("--------------- UNDO ----------");
        System.out.println();

        remote.undoPress();
        remote.undoPress();
        remote.undoPress();
        remote.undoPress();
        remote.undoPress();
        remote.undoPress();
        remote.undoPress();
        remote.undoPress();
        remote.undoPress();
    }
}