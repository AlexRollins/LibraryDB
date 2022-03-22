package com.techelevator.projects.dao;

import com.techelevator.projects.model.Book;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcBookDao implements BookDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcBookDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Book> getAllBooks(){

    }

    public List<Book> searchBooksByTitle(String titleSearch){

    }

    public List<Book> searchBookByAuthor(String firstNameSearch, String lastNameSearch){

    }

    public Book getBookById(long bookId){

    }

    public Book createBook(Book newBook){

    }

    private Book mapRowToBook(SqlRowSet row){
        Book book = new Book();
        book.setBookId(row.getLong("book_id"));
        book.setTitle(row.getString("title"));
        if(row.getString("subtitle") != null) {
            book.setSubtitle(row.getString("subtitle"));
        }
        if(row.getInt("publishYear") != 0) {
            book.setPublishYear(row.getInt("publishYear"));
        }
        return book;
    }
}
