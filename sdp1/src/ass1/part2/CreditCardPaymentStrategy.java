package ass1.part2;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " Credit Card.");
    }
}
