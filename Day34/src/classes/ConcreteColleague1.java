package classes;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("ConcreteColleague1 enviando mensagem: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague1 recebeu mensagem: " + message);
    }
}