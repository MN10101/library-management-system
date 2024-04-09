package com.example.librarymanagementsystem.dao;

import com.example.librarymanagementsystem.entity.Book;

import java.util.List;

public interface BookDAOInterface {

    public List<Book> findAll();

    Book findById(int id);

    Book update(Book book);

    void deleteById(int id);
}
