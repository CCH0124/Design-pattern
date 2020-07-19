package command;

public class LightOffCommand implements Command {
    LightReceiver light;
    
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        light.off();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        light.on();
    }

    /**
     * @param light
     */
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }
}