package classes;

public class Aluno{
    public String nome;
    public int idade;
    public int notaMatematica;
    public int notaPortugues;
    public int notaBiologia;
    public int media;
    
    public Aluno(String nome, int idade , int notaMatematica, int notaBiologia, int notaPortugues){
        this.nome = nome ;
        this.idade = idade;
        this.notaBiologia = notaBiologia;
        this.notaPortugues = notaPortugues;
        this.notaMatematica = notaMatematica;

        this.media = (notaBiologia + notaMatematica + notaPortugues) / 3;
    }

    public void exibirInformacoes(){
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade : " + this.idade);
        System.out.println("Nota em biologia : "   + this.notaBiologia);
        System.out.println("Nota em matematica : " + this.notaMatematica);
        System.out.println(("Nota em portugues : " + this.notaPortugues));
        System.err.println("------------------------");
        System.out.println("Media : " + this.media );
    }
    
    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getNotaMatematica() {
        return notaMatematica;
    }
    public void setNotaMatematica(int notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    public int getNotaPortugues() {
        return notaPortugues;
    }
    public void setNotaPortugues(int notaPortugues) {
        this.notaPortugues = notaPortugues;
    }
    public int getNotaBiologia() {
        return notaBiologia;
    }
    public void setNotaBiologia(int notaBiologia) {
        this.notaBiologia = notaBiologia;
    }    
}