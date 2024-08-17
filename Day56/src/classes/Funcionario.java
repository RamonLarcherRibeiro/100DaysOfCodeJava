package classes;

public class Funcionario {
    private String nome;
    private double horasTrabalhadas;
    private double taxaPorHora;

    public Funcionario(String nome, double horasTrabalhadas, double taxaPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getTaxaPorHora() {
        return taxaPorHora;
    }

    public void setTaxaPorHora(double taxaPorHora) {
        this.taxaPorHora = taxaPorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * taxaPorHora;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Taxa por Hora: R$ " + taxaPorHora);
        System.out.println("Salario: R$ " + calcularSalario());
    }

}
