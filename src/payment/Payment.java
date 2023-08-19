package payment;

import payment.Interface.PaymentStrategy;

public class Payment {
    private PaymentStrategy paymentStrategy;
   public void setPaymentMethod(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount){
       paymentStrategy.processPayment(amount);
    }
}
