// Base class
class Payment {
    public void pay(double amount) {
        System.out.println("Paying $" + amount);
    }
}

// Subclass tightly coupled with Payment class
class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with Credit Card");
    }
}

public class TightCouplingDemo {
    public static void main(String[] args) {
        CreditCardPayment payment = new CreditCardPayment();
        payment.pay(100.0);
    }
}
