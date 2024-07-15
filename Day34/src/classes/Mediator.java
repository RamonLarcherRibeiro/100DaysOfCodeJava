package classes;
public interface Mediator {
    void sendMessage(String message, Colleague colleague);
    void addColleague(Colleague colleague);
}
