package library_management_system;

import library_management_system.books.BookItem;
import library_management_system.books.BookLending;
import library_management_system.books.BookReservation;
import library_management_system.enums.BookStatus;
import library_management_system.users.Librarian;
import library_management_system.users.Member;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        Librarian librarian = new Librarian();
        Member member = new Member();

        BookItem bookItem1 = new BookItem();
        BookItem bookItem2 = new BookItem();

        librarian.addBookItem(bookItem1);
        librarian.addBookItem(bookItem2);

        boolean isAvailable = bookItem1.checkout(member.getId());
        if(isAvailable){
            BookReservation bookReservation = new BookReservation(bookItem1.getId(), new Date(), member.getId());
            BookLending bookLending = new BookLending(new Date(), new Date(), bookReservation, member);
            boolean canLend = BookLending.lendBook(bookItem1.getId(), member.getId());

            if(canLend){
                member.checkoutBookItem(bookItem1);
                bookItem1.setStatus(BookStatus.LOANED);
            }
            else
                System.out.println("Sorry cannot checkout requested book, " + bookItem1.getStatus());
        }
    }


}
