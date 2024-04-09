package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.dao.BookDAOInterface;
import com.example.librarymanagementsystem.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServiceInterface{

    private BookDAOInterface bookDAOInterface;

    @Autowired
    public BookService(BookDAOInterface bDAO){
        bookDAOInterface = bDAO;
    }
    @Override
    public List<Book> findAll() {
        return bookDAOInterface.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookDAOInterface.findById(id);
    }

    @Transactional
    @Override
    public Book update(Book book) {
        return bookDAOInterface.update(book);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        bookDAOInterface.deleteById(id);
    }
}
