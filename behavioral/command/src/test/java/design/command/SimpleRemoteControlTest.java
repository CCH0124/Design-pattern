package design.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import design.command.commands.v1.concrete.GarageDoorUpCommand;
import design.command.commands.v1.concrete.LightOnCommand;
import design.command.invokers.v1.SimpleRemoteControl;
import design.command.receivers.GarageDoor;
import design.command.receivers.Light;


public class SimpleRemoteControlTest {
    @Test
    void remoteControlTest() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        var res = remote.buttonWasPressed();
        System.out.println(res);
        assertEquals("on", res);

        GarageDoor garageDoor = new GarageDoor("Main");
        GarageDoorUpCommand garageUp = new GarageDoorUpCommand(garageDoor);
        remote.setCommand(garageUp);
        var garageDoorRes = remote.buttonWasPressed();
        System.out.println(garageDoorRes);
        assertEquals("up", garageDoorRes);

    }
}
