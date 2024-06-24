import classes.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}
