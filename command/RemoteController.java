package command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < offCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonWasPushed(int no){
        // 按下的開關按鈕，並調用對應方法
        onCommands[no].execute();
        // 紀錄當前操作，用於撤銷用
        undoCommand = onCommands[no];
    }
    public void offButtonWasPushed(int no){
        // 按下的開關按鈕，並調用對應方法
        offCommands[no].execute();
        // 紀錄當前操作，用於撤銷用
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}