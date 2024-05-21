package library_management_system.search;

import library_management_system.books.Book;

import java.util.Date;
import java.util.List;

public interface Search {
    // Interface method (does not have a body)
    public List<Book> searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> searchBySubject(String subject);
    public List<Book> searchByPublicationDate(Date publishDate);
}
