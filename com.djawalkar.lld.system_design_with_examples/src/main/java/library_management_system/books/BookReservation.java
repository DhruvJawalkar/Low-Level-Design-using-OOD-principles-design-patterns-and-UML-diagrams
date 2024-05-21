package library_management_system.books;

import library_management_system.enums.ReservationStatus;

import java.util.Date;

public class BookReservation {
    private String itemId;
    private Date creationDate;

    private ReservationStatus status;
    private String memberId;

    public BookReservation(String itemId, Date creationDate, String memberId){
        this.itemId = itemId;
        this.creationDate = creationDate;
        this.memberId = memberId;
    }
    public static BookReservation fetchReservationDetails(String bookItemId) {
        return null;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}

