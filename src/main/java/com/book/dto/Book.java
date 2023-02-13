package com.book.dto;

public class Book {
    private int bookId;
    private String bname;

    public Book(int bookId, String bname) {
        this.bookId = bookId;
        this.bname = bname;

    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getBookId() {
        return this.bookId;
    }

    public String getBname() {
        return this.bname;
    }

    @Override
    public String toString() {
        return "bookID:"+bookId+" bname:"+bname;
    }
}

