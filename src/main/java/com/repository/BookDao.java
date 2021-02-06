package com.repository;



import com.model.Book;

import java.util.List;

public interface BookDao {
    Book getBookById (Integer id);
    List<Book> getAllBooks();
    boolean deleteBook(Book book);
    boolean updateBook(Book book);
    boolean createBook(Book book);
}

