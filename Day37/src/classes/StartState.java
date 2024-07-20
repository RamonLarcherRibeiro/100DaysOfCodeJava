package classes;
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Estado: Start");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}