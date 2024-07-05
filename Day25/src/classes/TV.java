package classes;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV foi ligada.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV foi desligada.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume : " + volume);
    }
}

