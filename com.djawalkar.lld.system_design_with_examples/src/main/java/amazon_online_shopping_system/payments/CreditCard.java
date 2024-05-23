package amazon_online_shopping_system.payments;

import amazon_online_shopping_system.Address;
import amazon_online_shopping_system.enums.PaymentStatus;

public class CreditCard extends Payment {
    private String cardNumber;
    private String expiryDate;
    private String nameOnCard;
    private int code;
    private Address billingAddress;

    public CreditCard(String cardNumber, String expiryDate, String nameOnCard, int code, Address billingAddress){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.nameOnCard = nameOnCard;
        this.code = code;
        this.billingAddress = billingAddress;
    }
    public PaymentStatus makePayment(double amount) {
        //PaymentStatus.PENDING;
        // functionality
        return PaymentStatus.CONFIRMED;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }
}
