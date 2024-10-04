public class CreditCardPayment implements PaymentStrategy{

    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    @Override
    public void pay(int amount) {
        System.out.println("Payment of Rs." + amount + " received by CreditCard: " + creditCardNumber);
    }
}
