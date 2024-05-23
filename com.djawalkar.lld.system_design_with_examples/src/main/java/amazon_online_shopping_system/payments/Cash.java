package amazon_online_shopping_system.payments;

import amazon_online_shopping_system.enums.PaymentStatus;

public class Cash extends Payment {
    private String billingAddress;
    public PaymentStatus makePayment(double amount) {
        // functionality
        return PaymentStatus.CONFIRMED;
    }
}
