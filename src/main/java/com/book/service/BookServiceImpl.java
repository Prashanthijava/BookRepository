package com.book.service;

import com.book.dto.Book;

import java.util.ArrayList;
import java.util.List;


public class BookServiceImpl implements BookService {
    static List<Book> books = new ArrayList<>();

    @Override
    public int addBook(Book book) {
        books.add(book);
        return book.getBookId();
    }

    @Override
    public int updateBook(Book book) {
        books.add(book);
        return book.getBookId();

    }

    @Override
    public int deleteBook(int bookId) {
        Book book = books.get(bookId);
        books.remove(book);
        return bookId;

    }

    @Override
    public Book displayBook(int bookId) {

        return books.get(bookId);
    }


}
