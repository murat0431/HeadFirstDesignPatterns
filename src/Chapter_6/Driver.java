package Chapter_6;

import Chapter_6.api.Command;
import Chapter_6.api.LightOffCommand;
import Chapter_6.api.LightOnCommand;
import Chapter_6.api.RemoteControl;
import Chapter_6.vendor.Light;

public class Driver {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl();
        Light light = new Light();
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);
        rc.setCommand(0, onCommand, offCommand);
        rc.onButtonWasPressed(0);
        light.status();
        rc.offButtonWasPressed(0);
        light.status();
        rc.undoCommandWasPressed();
        light.status();
    }
}
