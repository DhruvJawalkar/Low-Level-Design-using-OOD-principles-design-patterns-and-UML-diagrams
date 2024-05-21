package library_management_system.users;

import library_management_system.books.BookItem;

import java.util.Date;

public class Member extends User {
    private Date dateOfMembership;
    private int totalBooksCheckedOut;

    public boolean reserveBookItem(BookItem bookItem) {
        return false;
    }

    private void incrementTotalBooksCheckedOut() {
        totalBooksCheckedOut++;
    }

    public boolean checkoutBookItem(BookItem bookItem) {
        return false;
    }

    private void checkForFine(String bookItemId) {
    }

    public void returnBookItem(BookItem bookItem) {

    }

    public boolean renewBookItem(BookItem bookItem) {
        return false;
    }

    public boolean resetPassword() {
        // definition
        return true;
    }
}
