package design.command.commands.v2.concrete;

import design.command.commands.v2.Command;

public class NoCommand implements Command {
    @Override
    public String execute() {
        return "No command assigned";
    }

    @Override
    public String undo() {
        return "No undo command assigned";
    }

    
    
}
