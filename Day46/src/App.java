import classes.Cliente;
import classes.Servico;
import classes.ServicoImpl;

public class App {
    public static void main(String[] args) throws Exception {
          // Criação da instância do serviço
        Servico servico = new ServicoImpl();
        
        // Injeção do serviço no cliente
        Cliente cliente = new Cliente(servico);
        
        // Uso do cliente
        cliente.realizarAcao();
    }
}
