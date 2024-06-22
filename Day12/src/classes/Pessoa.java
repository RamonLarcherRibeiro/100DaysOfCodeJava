package classes;
public class Pessoa {
    public String nome;
    protected int idade;
    private double salario;
    String cidade; // default
    
    public Pessoa(String nome, int idade, double salario, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cidade = cidade;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Cidade: " + cidade);
    }
    
    protected void modificarSalario(double novoSalario) {
        this.salario = novoSalario;
    }
}