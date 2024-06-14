package Animais;

public class Gato extends Animal {
    
    //polimorfismo em tempo de compilação usando sobrecarga (overloading)
    public void emitirSom(String nome){
        System.out.println("o gato " + nome + " esta miando");
    }
    
}
