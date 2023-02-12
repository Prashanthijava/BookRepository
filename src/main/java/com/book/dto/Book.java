package com.book.dto;

public class Book {
    private int bookId;
    private String bname;

    public Book(int bookId, String bname) {
        this.bookId = bookId;
        this.bname = bname;

    }

    public void setBookId(int bookId) {
        bookId = bookId;
    }

    public void setBname(String bname) {
        bname = bname;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBname() {
        return bname;
    }
}

