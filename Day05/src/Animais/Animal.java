package Animais;

public abstract class Animal {
    String Especie;
    
    Animal(String especie){
        this.Especie = especie;
    }

    // Método abstrato (sem corpo)
    public abstract void emitirSom();

    // Método concreto (com corpo)
    public void dormir() {
        System.out.println("O " + Especie + " está dormindo.");
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }
    
}
