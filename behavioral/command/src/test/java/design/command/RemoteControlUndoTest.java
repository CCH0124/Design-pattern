package design.command;

import org.junit.jupiter.api.Test;

import design.command.commands.v2.concrete.CeilingFanHighCommand;
import design.command.commands.v2.concrete.CeilingFanMediumCommand;
import design.command.commands.v2.concrete.CeilingFanOffCommand;
import design.command.commands.v2.concrete.LightOffCommand;
import design.command.commands.v2.concrete.LightOnCommand;
import design.command.invokers.v2.RemoteControl;
import design.command.receivers.CeilingFan;
import design.command.receivers.Light;

public class RemoteControlUndoTest {

    @Test
    void remoteControlUndoTest() {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);  

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
    }


    @Test
    void remoteControlFanUndoTest() {
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
   
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
   
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
  
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
    }

}