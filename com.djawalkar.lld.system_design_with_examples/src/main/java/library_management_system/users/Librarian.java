package library_management_system.users;

import library_management_system.books.BookItem;

public class Librarian extends User {
    public boolean addBookItem(BookItem bookItem) {
        return false;
    }

    public boolean blockMember(Member member) {

        return false;
    }

    public boolean unBlockMember(Member member) {
        return false;
    }

    public boolean resetPassword() {
        // definition
        //do reset pwd for self
        return true;
    }
}
