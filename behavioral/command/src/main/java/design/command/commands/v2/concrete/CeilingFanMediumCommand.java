package design.command.commands.v2.concrete;

import design.command.commands.v2.Command;
import design.command.receivers.CeilingFan;

public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
 
	public String execute() {
		preSpeed = ceilingFan.getSpeed();
		return ceilingFan.medium();
	}
 
    @Override
    public String undo() {
        if (preSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
            return "Undo to High";
		} else if (preSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
            return "Undo to Medium";
		} else if (preSpeed == CeilingFan.LOW) {
			ceilingFan.low();
            return "Undo to Low";
		} else if (preSpeed == CeilingFan.OFF) {
			ceilingFan.off();
            return "Undo to Off";
		}
        return "No undo command assigned";
    }
}
