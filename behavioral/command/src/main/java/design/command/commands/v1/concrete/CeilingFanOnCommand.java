package design.command.commands.v1.concrete;

import design.command.commands.v1.Command;
import design.command.receivers.CeilingFan;

public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public String execute() {
        return ceilingFan.high();
    }
    
}
