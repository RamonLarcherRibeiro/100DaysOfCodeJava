package classes;
public class Cliente {
    private Servico servico;

    // Injeção via construtor
    public Cliente(Servico servico) {
        this.servico = servico;
    }

    public void realizarAcao() {
        servico.executar();
    }
}
