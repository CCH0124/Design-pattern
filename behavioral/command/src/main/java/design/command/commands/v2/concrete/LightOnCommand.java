package design.command.commands.v2.concrete;

import design.command.commands.v2.Command;
import design.command.receivers.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.on();
    }

    @Override
    public String undo() {
        light.off();
        return "Undo to Off";
    }
    
}
