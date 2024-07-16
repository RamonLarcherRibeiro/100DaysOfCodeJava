package classes;

// Caretaker
import java.util.Stack;

public class TextoCaretaker {
    private Stack<TextoMemento> historico = new Stack<>();

    public void salvarEstado(TextoEditor editor) {
        historico.push(editor.salvar());
    }

    public void desfazer(TextoEditor editor) {
        if (!historico.isEmpty()) {
            TextoMemento memento = historico.pop();
            editor.restaurar(memento);
        }
    }
}
