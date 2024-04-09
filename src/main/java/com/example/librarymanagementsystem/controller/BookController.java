package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.service.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private BookServiceInterface bookService;

    @Autowired
    public BookController(BookServiceInterface bService){
        bookService = bService;
    }

    @GetMapping("/book")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/book/{bookId}")
    public Book getBook(@PathVariable int bookId){
        Book book = bookService.findById(bookId);

        if(book == null){
            throw new RuntimeException("Book ID not found " + bookId);
        }
        return book;
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        book.setId(0);
        Book bookDB = bookService.update(book);
        return bookDB;
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book){
        Book bookDB = bookService.update(book);
        return bookDB;
    }

    @DeleteMapping("/book/{bookId}")
    public String deleteBook(@PathVariable int bookId){
        Book book = bookService.findById(bookId);

        if(book == null){
            throw new RuntimeException("Book ID not found " + bookId);
        }
        bookService.deleteById(bookId);

        return "The book with ID " + bookId + " has been deleted.";
    }
}
