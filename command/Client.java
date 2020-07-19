package command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        /**
         * no = 0，為電燈開關
         */
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("Open");
        remoteController.onButtonWasPushed(0);
        System.out.println("Close");
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();
    }
}