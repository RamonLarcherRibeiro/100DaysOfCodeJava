import Animais.Passaro;

public class App {
    public static void main(String[] args) throws Exception {
       //Animal animal = new Animal(); Classe abstrata nao pode ser instanciada diretamente

        Passaro passaro1 = new Passaro();
        passaro1.emitirSom();
        passaro1.dormir();
    }
}
