package design.command.commands.v1.concrete;

import design.command.commands.v1.Command;
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
