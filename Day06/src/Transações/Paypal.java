package Transações;

public class Paypal implements Pagamento, Recebimento { 
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de "+valor +"R$ feito com Paypal" );       
    }  
    
    @Override
    public void receber(double valor) {
        System.out.println("Valor de "+valor+"R$ recebido na sua conta Paypal");      
    } 
}
