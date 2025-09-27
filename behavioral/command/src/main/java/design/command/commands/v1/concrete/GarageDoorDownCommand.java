package design.command.commands.v1.concrete;

import design.command.commands.v1.Command;
import design.command.receivers.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public String execute() {
        return garageDoor.down();
    }
    
}
