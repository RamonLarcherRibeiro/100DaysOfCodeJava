package Classes;

public class Person {
    String nome;
    int idade;

    public Person(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return nome + ':'+ idade;
    }
    
}
