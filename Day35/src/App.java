import classes.TextoCaretaker;
import classes.TextoEditor;

public class App {
    public static void main(String[] args) throws Exception {
        TextoEditor editor = new TextoEditor();
        TextoCaretaker caretaker = new TextoCaretaker();

        editor.escrever("Primeira versão do texto.");
        caretaker.salvarEstado(editor);
        System.out.println(editor.getTexto());

        editor.escrever("Segunda versão do texto.");
        caretaker.salvarEstado(editor);
        System.out.println(editor.getTexto());

        editor.escrever("Terceira versão do texto.");
        System.out.println(editor.getTexto());

        caretaker.desfazer(editor);
        System.out.println("Após desfazer: " + editor.getTexto());

        caretaker.desfazer(editor);
        System.out.println("Após desfazer novamente: " + editor.getTexto());
    }
    
}
