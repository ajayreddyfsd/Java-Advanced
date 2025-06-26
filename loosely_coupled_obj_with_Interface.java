// Payment interface (loose coupling)
interface Payment {
    void pay(double amount);
}

// Implementation 1
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with Credit Card");
    }
}

// Implementation 2
class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via PayPal");
    }
}

// Client class uses Payment interface
public class LooseCouplingDemo {
    public static void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }

    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        processPayment(creditCard, 150.0);
        processPayment(paypal, 200.0);
    }
}
