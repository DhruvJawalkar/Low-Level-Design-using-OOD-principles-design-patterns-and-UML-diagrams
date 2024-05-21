package library_management_system;

import java.util.Date;

public class LibraryCard {
    private String cardNumber;
    private Date issued;
    boolean active;

    public LibraryCard() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getIssued() {
        return issued;
    }

    public void setIssued(Date issued) {
        this.issued = issued;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private boolean isActive(){
        return active;
    }
}
