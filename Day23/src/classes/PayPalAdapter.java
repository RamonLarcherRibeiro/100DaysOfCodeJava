package classes;

public class PayPalAdapter implements PaymentProcessor{
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal){
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }

}

