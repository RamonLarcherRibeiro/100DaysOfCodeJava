import classes.Context;
import classes.StartState;
import classes.StopState;

public class App {
    public static void main(String[] args) throws Exception {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());    
    
    }
}
