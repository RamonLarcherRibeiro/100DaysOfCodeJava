import classes.ConcreteObserver;
import classes.ConcreteSubject;
import classes.*;
public class App {
    public static void main(String[] args) throws Exception {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("State 1");
        subject.setState("State 2");
    }
}
