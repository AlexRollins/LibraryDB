package com.techelevator.projects.model;

public class Author {
    private long authorId;
    private String firstName;
    private String lastName;

    public Author(){}

    public Author(int authorId, String firstName, String lastName) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getAuthorId() {return authorId;}
    public void setAuthorId(long authorId) {this.authorId = authorId;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String first_name) {this.firstName = first_name;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
}
