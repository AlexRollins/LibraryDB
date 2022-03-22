package com.techelevator.projects.dao;

import com.techelevator.projects.model.Book;

import java.util.List;
import java.util.ArrayList;

public interface BookDao {

    public List<Book> getAllBooks();

    public List<Book> searchBooksByTitle(String titleSearch);

    public List<Book> searchBookByAuthor(String firstNameSearch, String lastNameSearch);

    public Book getBookById(long bookId);

    public Book createBook(Book newBook);
}
