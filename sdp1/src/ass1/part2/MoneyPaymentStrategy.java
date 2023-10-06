package ass1.part2;

public class  MoneyPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " Cash$.");
    }
}
