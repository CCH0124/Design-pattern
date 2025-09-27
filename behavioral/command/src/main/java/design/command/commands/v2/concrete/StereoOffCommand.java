package design.command.commands.v2.concrete;

import design.command.commands.v2.Command;
import design.command.receivers.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
    
    @Override
	public String execute() {
		return stereo.off();
	}
}
