package com.book.service;

import com.book.dto.Book;

import java.util.ArrayList;
import java.util.List;


public class BookServiceImpl implements BookService {
    static List<Book> books = new ArrayList<>();

    static{
        Book book1 = new Book(10,"Java Spring");
        Book book2 = new Book(11,"Java Spring Boot");
        Book book3 = new Book(12,"Oracle");
        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

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
        for(Book book: books){
            if(book.getBookId() == bookId) {
                books.remove(book);
                break;
            }
        }
        return bookId;
    }

    @Override
    public Book displayBook(int bookId) {
        int index = 0;
        Book bookR =null;
        for(Book book: books){
            index++;
            if(book.getBookId() == bookId) {
                bookR = books.get(index);
                break;
            }
        }
        return bookR;
    }

    @Override
    public List<Book> displayAllBooks() {
        books.forEach(System.out::println);
        return  books;
    }

}
