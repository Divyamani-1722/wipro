Polymorphism
// Abstract class PaymentMethod
abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

// Derived class - CreditCard
class CreditCard extends PaymentMethod {
    private static final double FEE_PERCENTAGE = 2.5; // 2.5% transaction fee

    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        double totalAmount = amount + (amount * FEE_PERCENTAGE / 100);
        System.out.println("Processing Credit Card Payment. Total Charged: $" + totalAmount);
    }
}

// Derived class - PayPal
class PayPal extends PaymentMethod {
    public PayPal(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment. Amount Paid: $" + amount);
    }
}

// Transaction processing method demonstrating polymorphism
public class OnlinePaymentSystem {
    public static void processTransaction(PaymentMethod paymentMethod) {
        paymentMethod.processPayment(); // Polymorphism in action
    }

    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCard(100);
        PaymentMethod paypalPayment = new PayPal(100);

        System.out.println("Processing Transactions:");
        processTransaction(creditCardPayment);
        processTransaction(paypalPayment);
    }
}
