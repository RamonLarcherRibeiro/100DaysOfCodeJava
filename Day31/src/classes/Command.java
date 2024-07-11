package classes;

public interface Command {
    void execute();
    void undo(); // Opcional: para suportar a operação de desfazer
}