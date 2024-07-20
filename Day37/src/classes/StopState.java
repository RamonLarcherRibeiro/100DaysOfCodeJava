package classes;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Estado: Stop");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}