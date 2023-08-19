package payment;


import payment.strategy.WeChatPayment;

public class Customer {
    public static void main(String[] args) {
        Payment payment = new Payment();
        double amount = 100;

        payment.setPaymentMethod(new WeChatPayment());
        payment.pay(amount);
    }

}
