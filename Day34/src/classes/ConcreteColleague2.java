package classes;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("ConcreteColleague2 enviando mensagem: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague2 recebeu mensagem: " + message);
    }
}