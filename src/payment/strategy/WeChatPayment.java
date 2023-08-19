package payment.strategy;

import payment.Interface.PaymentStrategy;

public class WeChatPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("We chat payment amount of" + 100);
    }
}
