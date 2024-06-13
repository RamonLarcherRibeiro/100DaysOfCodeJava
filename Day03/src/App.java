import Animais.Cachorro;
import Animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();

        gato1.beber();
        gato1.miar();
        
        cachorro1.comer();
        cachorro1.latir();
        

    }
}
