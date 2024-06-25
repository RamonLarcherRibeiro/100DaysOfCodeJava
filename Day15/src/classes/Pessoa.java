package classes;

import java.util.Objects;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade =  idade ;
    }

    @Override
    public String toString() {
        return "Pessoa { nome: "+nome+" , idade: "+idade+"}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this == null || getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade &&
        Objects.equals(nome , pessoa.nome);
    }

    //o metodo hashCode deve estar de acordo com o metodo equals, se os objetos sao iguais de acordo com equals entao eles deve ter o mesmo hash 
    @Override
    public int hashCode() {
        return Objects.hash(nome ,idade);
    }


}