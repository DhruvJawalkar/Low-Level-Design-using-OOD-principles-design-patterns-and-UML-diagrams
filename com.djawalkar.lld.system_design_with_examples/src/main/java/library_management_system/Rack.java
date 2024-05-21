package library_management_system;

import library_management_system.books.BookItem;

import java.util.List;

public class Rack {
    private int number;
    private String locationIdentifier;
    private List<BookItem> bookItems;

    public Rack(){

    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    public void setLocationIdentifier(String locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }

    public List<BookItem> getBookItems() {
        return bookItems;
    }

    /*
    public void setBookItems(List<BookItem> bookItems) {
        this.bookItems = bookItems;
    }
     */

    public void addBookItem(BookItem bookItem) {
        // definition
        bookItems.add(bookItem);
    }
}

