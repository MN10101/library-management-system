package com.example.librarymanagementsystem.service;


import com.example.librarymanagementsystem.entity.Book;

import java.util.List;

public interface BookServiceInterface {

    public List<Book> findAll();

    Book findById(int id);

    Book update(Book book);

    void deleteById(int id);
}
