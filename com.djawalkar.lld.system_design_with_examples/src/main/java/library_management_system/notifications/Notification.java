package library_management_system.notifications;

import java.util.Date;
import library_management_system.books.BookLending;
import library_management_system.books.BookReservation;

public abstract class Notification {
    private String notificationId;
    private Date creationDate;
    private String content;
    private BookLending bookLending;
    private BookReservation bookReservation;

    public abstract boolean sendNotification();
}
