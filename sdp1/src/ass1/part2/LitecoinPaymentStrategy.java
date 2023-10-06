package ass1.part2;

public class LitecoinPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " Dogcoin.");
    }
}
