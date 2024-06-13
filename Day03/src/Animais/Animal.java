package Animais;

public class Animal {
    private String Espécie;
    private String Nome;

    public Animal(String nome, String Espécie){
        this.Nome = nome;
        this.Espécie = Espécie;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void comer(){
        System.out.println("o " + this.Espécie + " " + this.Nome + " está comendo !.");
    }

    public void beber(){
        System.out.println("o " + this.Espécie + " " + this.Nome + " está bebendo !.");
    }

    public String getEspécie() {
        return Espécie;
    }

    public void setEspécie(String espécie) {
        Espécie = espécie;
    }
      
}
