public class StripePayment implements PaymentStrategy{

    private String stripeId;

    public StripePayment(String stripeId) {
        this.stripeId = stripeId;
    }

    public void pay(int amount) {
        System.out.println("Payment of Rs." + amount + " received by Stripe: " + stripeId);
    }
}
