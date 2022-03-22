package com.techelevator.projects.model;

public class Book {
    private long bookId;
    private String title;
    private String subtitle;
    private int publishYear;

    public Book(){}

    public Book(int bookId, String title, String subtitle, int publishYear) {
        this.bookId = bookId;
        this.title = title;
        this.subtitle = subtitle;
        this.publishYear = publishYear;
    }

    public long getBookId() {return bookId;}
    public void setBookId(long bookId) {this.bookId = bookId;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getSubtitle() {return subtitle;}
    public void setSubtitle(String subtitle) {this.subtitle = subtitle;}
    public int getPublishYear() {return publishYear;}
    public void setPublishYear(int publishYear) {this.publishYear = publishYear;}
}
