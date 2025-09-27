package design.command.commands.v2.concrete;

import design.command.commands.v2.Command;
import design.command.receivers.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public String execute() {
        String result = "";
        result += stereo.on();
        result += " " + stereo.setCD();
        result += " " + stereo.setVolume(11);
        return result;
    }
    
}
