package classes;

public class Pessoa{
    public String nome;
    public String lastName;
    public int idade;
    public double altura;
    public double peso;


    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", lastName=" + lastName + ", idade=" + idade + ", altura=" + altura + ", peso="
                + peso + "]";
    }

    //o contrutor é privado para forçar o uso do builder
    private Pessoa(final Builder builder) {
        this.nome = builder.nome;
        this.lastName = builder.lastName;
        this.idade = builder.idade;
        this.altura = builder.altura;
        this.peso = builder.peso;
    }

    //classe estatica interna
    public static class Builder{
        String nome;
        String lastName;
        int idade;
        double altura;
        double peso;

        public Builder (){}

        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder idade (int idade){
            this.idade = idade;
            return this;
        }

        public Builder altura(double altura){
            this.altura = altura;
            return this;
        }

        public Builder peso(double peso){
            this.peso = peso;
            return this;
        } 

        public Pessoa build(){
            return new Pessoa(this);
        }
    }
    
}

