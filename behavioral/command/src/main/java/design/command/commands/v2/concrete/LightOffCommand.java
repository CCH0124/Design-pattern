package design.command.commands.v2.concrete;

import design.command.commands.v2.Command;
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

    @Override
    public String undo() {
        light.on();
        return "Undo to On";
    }
    
}
