package classes;

public class ImagemReal implements Imagem {
    private String nomeDoArquivo;

    public ImagemReal(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
        carregarImagemDoDisco();
    }

    private void carregarImagemDoDisco() {
        System.out.println("Carregando " + nomeDoArquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo " + nomeDoArquivo);
    }
}