package com.book.service;

import com.book.dto.Book;

import java.util.List;

public interface BookService {
    public int addBook(Book book);
    public int updateBook(Book book);
    public int deleteBook(int bookId);
    public Book displayBook(int bookId);
    public List<Book> displayAllBooks();

}
