public class App {
    public static void main(String[] args) {
        ContaBancária conta = new ContaBancária("João", 1000.0);

       
        conta.exibirInformacoes();

        // Realizando depósitos
        conta.depositar(500.0);
        conta.depositar(-50.0); 
        // Realizando saques
        conta.sacar(200.0);
        conta.sacar(2000.0); 
        conta.sacar(-30.0); 

        conta.exibirInformacoes();
    }

}
