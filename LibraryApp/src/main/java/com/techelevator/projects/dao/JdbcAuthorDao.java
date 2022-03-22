package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Author;

public class JdbcAuthorDao implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcAuthorDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Author getAuthor(long authorId) {
        Author author = null;
        String sql = "SELECT author_id, first_name, last_name " +
                "FROM author " +
                "WHERE author_id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, authorId);
        if(result.next()){
            author = mapRowToAuthor(result);
        }
        return author;
    }

    private Author mapRowToAuthor(SqlRowSet row){
        Author author = new Author();
        author.setAuthorId(row.getLong("author_id"));
        author.setFirstName(row.getString("first_name"));
        author.setFirstName(row.getString("last_name"));
        return author;
    }
}
