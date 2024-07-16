package classes;

public class TextoEditor {
    private String texto;

    public void escrever(String novoTexto) {
        texto = novoTexto;
    }

    public String getTexto() {
        return texto;
    }

    public TextoMemento salvar() {
        return new TextoMemento(texto);
    }

    public void restaurar(TextoMemento memento) {
        texto = memento.getEstado();
    }
}