package ass1.part2;

public class main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("Chairs", 250, 12);
        Product product2 = new Product("Sofas", 410, 5);
        Product product3 = new Product("Kitchen accessories", 120, 5);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
        PaymentStrategy payPalPayment = new MoneyPaymentStrategy();

        cart.checkout(creditCardPayment);

        cart.checkout(payPalPayment);

        PaymentStrategy bitcoinPayment = new LitecoinPaymentStrategy();
        cart.checkout(bitcoinPayment);

    }
}
