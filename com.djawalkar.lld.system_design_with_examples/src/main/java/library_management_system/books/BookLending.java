package library_management_system.books;

import library_management_system.users.Member;
import library_management_system.users.User;

import java.util.Date;

public class BookLending {
    private String itemId;
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String memberId;
    private BookReservation bookReservation;
    private User user;

    public BookLending(Date creationDate, Date dueDate, BookReservation bookReservation, Member member){
        this.itemId = bookReservation.getItemId();
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.bookReservation = bookReservation;
        this.user = member;
    }
    public static boolean lendBook(String bookItemId, String memberId) {
        return false;
    }

    public static BookLending fetchLendingDetails(String bookItemId) {
        return null;
    }
}
