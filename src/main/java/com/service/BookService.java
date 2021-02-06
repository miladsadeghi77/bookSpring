package com.service;

import com.model.Book;
import com.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService  {
@Autowired
public BookRepository bookRepository;

    public Book getBookById(Integer id) {
        return bookRepository.getBookById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }


    public boolean deleteBook(Book book) {
        return bookRepository.deleteBook(book);
    }


    public boolean createBook(Book book) {
        return bookRepository.createBook(book);
    }


    public boolean updateBook(Book book) {
        return bookRepository.updateBook(book);
    }

}
