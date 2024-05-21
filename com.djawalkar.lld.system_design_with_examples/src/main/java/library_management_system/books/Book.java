package library_management_system.books;

import library_management_system.enums.BookFormat;
import library_management_system.users.Author;

import java.util.List;

public abstract class Book {
    private String isbn;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;
    private BookFormat bookFormat;
    private List<Author> authors;
}
