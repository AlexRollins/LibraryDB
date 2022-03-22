package com.techelevator.projects;

import com.techelevator.projects.dao.AuthorDao;
import com.techelevator.projects.dao.BookDao;
import com.techelevator.projects.dao.JdbcAuthorDao;
import com.techelevator.projects.dao.JdbcBookDao;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.awt.*;
import com.techelevator.projects.dao.AuthorDao;

public class LibraryCLI {

    private final Menu menu;
    private final JdbcAuthorDao authorDao;
    private final JdbcBookDao bookDao;

    public LibraryCLI(DataSource datasource) {
        this.menu = new Menu(System.in, System.out);
        bookDao = new JdbcBookDao(datasource);
        authorDao = new JdbcAuthorDao(datasource);
    }

    public static void main(String[] args){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/LibraryDB");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        LibraryCLI application = new LibraryCLI(dataSource);
        application.run();
    }
}
