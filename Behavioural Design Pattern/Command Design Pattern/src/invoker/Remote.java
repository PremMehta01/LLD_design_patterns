package invoker;

import command.Command;

import java.util.Stack;

public class Remote {

    Command command;
    Stack<Command> commands;

    public Remote() {
        this.commands = new Stack<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commands.push(command);
    }

    public void undoPress() {
        if(!commands.isEmpty()) {
            Command recentCommand = commands.pop();
            recentCommand.undo();
        }
    }

}
