package amazon_online_shopping_system.payments;

import amazon_online_shopping_system.enums.PaymentStatus;

import java.util.Date;

// Payment is an abstract class
public abstract class Payment {
    private double amount;
    private Date timestamp;
    private PaymentStatus status;
    public abstract PaymentStatus makePayment(double amount);
}

