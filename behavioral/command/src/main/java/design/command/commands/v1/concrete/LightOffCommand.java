package design.command.commands.v1.concrete;

import design.command.commands.v1.Command;
import design.command.receivers.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.off();
    }
    
}
