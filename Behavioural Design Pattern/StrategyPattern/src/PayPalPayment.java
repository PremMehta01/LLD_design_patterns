public class PayPalPayment implements PaymentStrategy{

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(int amount) {
        System.out.println("Payment of Rs. " + amount + " received by paypal with email " + email);
    }

}