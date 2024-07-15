package classes;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for (Colleague c : colleagues) {
            // Evita enviar a mensagem para o próprio colega que enviou
            if (c != colleague) {
                c.receive(message);
            }
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
}
