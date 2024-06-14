package Animais;

public class Cachorro extends Animal {

    //polimorfismo em tempo de compilação usando sobrescrita (overring)
    @Override
    public void emitirSom(){
        System.out.println("O cachorro esta latindo");

    }

    
}
