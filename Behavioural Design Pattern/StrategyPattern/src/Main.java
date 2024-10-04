//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy paymentStrategy = new CreditCardPayment("1234567890");
        paymentContext.setPaymentStrategy(paymentStrategy);
        paymentContext.pay(100);

        PaymentStrategy paypalPayment = new PayPalPayment("user@gmail.com");
        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.pay(500);

        PaymentStrategy stripePayment = new StripePayment("stripe123");
        paymentContext.setPaymentStrategy(stripePayment);
        paymentContext.pay(1500);
    }
}