package design.command.invokers.v1;

import design.command.commands.v1.Command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public String buttonWasPressed() {
        return slot.execute();
    }
}
