package library_management_system.books;

import library_management_system.Rack;
import library_management_system.enums.BookStatus;
import library_management_system.users.Librarian;

import java.util.Date;

public class BookItem {
    private String id;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Rack placedAt;
    private Book book;  // Agggregation: BookItem has a reference to a Book

    // Constructors, getters, and other existing methods...

    public boolean checkout(String memberId) {
        // Implementation for checkout logic
        // Update the status, set due date, etc.
        // Return true if checkout is successful, false otherwise
        return true;  // Placeholder, replace with actual logic
    }

    public void setPlacedAt(Rack rack) {
        this.placedAt = rack;
        // Additional logic if needed
    }

    public void setAddedBy(Librarian librarian) {
        // Implementation for setting the librarian who added the book item
        // This might involve updating logs or other data related to the librarian
        // No return value as it's a setter method
    }

    // Other methods...

    public Book getBook() {
        return book;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isReferenceOnly() {
        return isReferenceOnly;
    }

    public void setReferenceOnly(boolean referenceOnly) {
        isReferenceOnly = referenceOnly;
    }

    public Date getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Date borrowed) {
        this.borrowed = borrowed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Rack getPlacedAt() {
        return placedAt;
    }
}
