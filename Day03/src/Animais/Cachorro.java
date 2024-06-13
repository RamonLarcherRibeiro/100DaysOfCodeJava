package Animais;

public class Cachorro extends Animal {

    //construtor
    public Cachorro(){
        super("caramelo","Cachorro");
    }

    //metodo latir
    public void latir(){
        System.out.println("o "+ this.getEspécie() + " " + this.getNome() + " esta latindo");
    }
    
    
}
