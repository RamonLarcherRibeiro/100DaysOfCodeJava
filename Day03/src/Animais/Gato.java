package Animais;

public class Gato extends Animal {

    public Gato(){
        super("garfield", "Gato");  
    }

    public void miar(){
        System.out.println("o "+ this.getEspécie() + " " + this.getNome() + " esta miando !");
    }

    

       
    
}
