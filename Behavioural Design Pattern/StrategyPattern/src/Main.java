//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new CreditCardPayment("1234567890");
        paymentStrategy.pay(100);

        PaymentStrategy paypalPayment = new PayPalPayment("user@gmail.com");
        paypalPayment.pay(500);

        PaymentStrategy stripePayment = new StripePayment("stripe123");
        stripePayment.pay(1500);
    }
}