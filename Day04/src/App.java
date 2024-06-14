import Animais.Cachorro;
import Animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();

        gato1.emitirSom();
        gato1.emitirSom("garfield");
        cachorro1.emitirSom();
    }
}
