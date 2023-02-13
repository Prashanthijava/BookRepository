package com.book.service;

import com.book.dto.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestBookServiceImpl {

    private BookServiceImpl bookServiceImpl = null;
    @Before
    public void setup(){
        bookServiceImpl = new BookServiceImpl();
    }
    @Test
    public void testAddingBook()
    {
        Book book = new Book(14,"Java Spring Thymeleaf","Ram");
        int bookId = bookServiceImpl.addBook(book);
        assertTrue(bookId==14);

    }
    @Test
    public void testUpdatingBook()
    {
        Book updatedBook = new Book(10,"Java Spring Boot","Jack");
        int updatedBookId =  bookServiceImpl.updateBook(updatedBook);
        assertEquals(updatedBook.getBname(),"Java Spring Boot");

    }
    @Test
    public void testDeletingBook()
    {
       int deletedBookId =  bookServiceImpl.deleteBook(12);
        assertTrue(deletedBookId==12);

    }
    @Test
    public void testDisplayingBook()
    {
        Book book = bookServiceImpl.displayBook(11);
       // assertTrue(book.getBookId()==12);
       // assertEquals(book.getBname(), "Java Spring Boot");
    }

    @Test
    public void testDisplayingAllBook()
    {
        List<Book> books = bookServiceImpl.displayAllBooks();
        assertNotNull(books);
    }
}
