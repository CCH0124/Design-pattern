package command;

public class LightOnCommand implements Command {
    LightReceiver light;
    
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        light.on();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        light.off();
    }

    /**
     * @param light
     */
    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }
    
}