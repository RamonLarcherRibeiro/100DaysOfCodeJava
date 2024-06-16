import Transações.Paypal;

public class App {
    public static void main(String[] args) throws Exception {
        Paypal contaPaypal = new Paypal();

        contaPaypal.receber(3000);
        contaPaypal.pagar(500);
    }

}
