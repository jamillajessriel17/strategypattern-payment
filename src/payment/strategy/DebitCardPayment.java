package payment.strategy;

import payment.Interface.PaymentStrategy;

public class DebitCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("DebitCard Payment amount of " + amount);
    }

}
