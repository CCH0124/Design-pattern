package design.command.commands.v2.concrete;

import design.command.commands.v2.Command;
import design.command.receivers.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public String execute() {
		return ceilingFan.off();
	}
    
}
