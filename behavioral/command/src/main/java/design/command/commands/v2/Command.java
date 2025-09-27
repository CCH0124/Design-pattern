package design.command.commands.v2;

public interface Command {
    public String execute();

    default public String undo() {
        return "No undo command assigned";
    }
}
