import classes.BasicRemoteControl;
import classes.RemoteControl;
import classes.Device;
import classes.TV;
import classes.Radio;


public class App {
    public static void main(String[] args) throws Exception {
        Device tv = new TV();
        RemoteControl tvRemote = new BasicRemoteControl(tv);
        tvRemote.turnOn();
        tvRemote.setVolume(10);
        tvRemote.turnOff();

        Device radio = new Radio();
        RemoteControl radioRemote = new BasicRemoteControl(radio);
        radioRemote.turnOn();
        radioRemote.setVolume(20);
        radioRemote.turnOff();    }
}
