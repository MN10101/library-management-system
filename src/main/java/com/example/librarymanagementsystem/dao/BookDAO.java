package com.example.librarymanagementsystem.dao;

import com.example.librarymanagementsystem.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAO implements BookDAOInterface{

    private EntityManager entityManager;

    @Autowired
    public BookDAO(EntityManager em){
        entityManager = em;
    }

    @Override
    public List<Book> findAll() {
        TypedQuery<Book> query = entityManager.createQuery("from Book ", Book.class);
        List<Book> books = query.getResultList();
        return books;
    }

    @Override
    public Book findById(int id) {
        Book book = entityManager.find(Book.class, id);
        return book;
    }

    @Override
    public Book update(Book book) {
        Book bookDB = entityManager.merge(book);
        return bookDB;
    }

    @Override
    public void deleteById(int id) {
        Book book = entityManager.find(Book.class, id);
        entityManager.remove(book);
    }
}
