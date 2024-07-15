import classes.ConcreteColleague1;
import classes.ConcreteColleague2;
import classes.ConcreteMediator;

public class App {
    public static void main(String[] args) throws Exception {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        colleague1.send("Olá, ConcreteColleague2!");
        colleague2.send("Oi, ConcreteColleague1! Como você está?");
    }
}
