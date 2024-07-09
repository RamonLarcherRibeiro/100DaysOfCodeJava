import classes.Imagem;
import classes.ImagemProxy;

public class App {
    public static void main(String[] args) throws Exception {
        Imagem imagem = new ImagemProxy("imagem.jpg");

        // A imagem será carregada do disco apenas na primeira vez
        imagem.exibir();

        // A imagem não será carregada do disco novamente
        imagem.exibir();
    }
}
