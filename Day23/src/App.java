import classes.PayPal;
import classes.PayPalAdapter;
import classes.PaymentProcessor;
import classes.Stripe;
import classes.StripeAdapter;

public class App {
    public static void main(String[] args) throws Exception {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(1000000);

        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        stripeProcessor.processPayment(1000000);
    }
}
