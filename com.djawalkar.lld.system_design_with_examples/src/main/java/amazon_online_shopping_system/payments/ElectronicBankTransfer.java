package amazon_online_shopping_system.payments;

import amazon_online_shopping_system.enums.PaymentStatus;

public class ElectronicBankTransfer extends Payment {
    private String bankName;
    private String routingNumber;
    private String accountNumber;
    private String billingAddress;
    public PaymentStatus makePayment() {
        //PaymentStatus.PENDING;
        // functionality
        return PaymentStatus.CONFIRMED;
    }

    @Override
    public PaymentStatus makePayment(double amount) {
        return null;
    }
}
