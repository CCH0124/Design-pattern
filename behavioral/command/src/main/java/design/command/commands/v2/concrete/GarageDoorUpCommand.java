package design.command.commands.v2.concrete;

import design.command.commands.v2.Command;
import design.command.receivers.GarageDoor;

public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public String execute() {
        return garageDoor.up();
    }
    
}
