package design.command.commands.v1.concrete;

import design.command.commands.v1.Command;

public class NoCommand implements Command {
    @Override
    public String execute() {
        return "No command assigned";
    }
    
}
