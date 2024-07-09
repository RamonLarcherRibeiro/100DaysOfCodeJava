package classes;

public class ImagemProxy implements Imagem {
    private ImagemReal imagemReal;
    private String nomeDoArquivo;

    public ImagemProxy(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(nomeDoArquivo);
        }
        imagemReal.exibir();
    }
}