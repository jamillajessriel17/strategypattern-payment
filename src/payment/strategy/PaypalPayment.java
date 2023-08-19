package payment.strategy;

import payment.Interface.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal Payment payment amount of" + amount);
    }
}
