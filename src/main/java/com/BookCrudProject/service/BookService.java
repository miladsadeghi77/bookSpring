package com.BookCrudProject.service;

import com.BookCrudProject.dao.BookDao;
import com.BookCrudProject.model.Book;
import com.BookCrudProject.repository.BookMapper;
import com.BookCrudProject.repository.BookRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookService implements BookDao {
 public BookRepository bookRepository;
 public BookService(BookRepository bookRepository) {
   this.bookRepository=bookRepository;
 }
 public BookService() {

 }

 private JdbcTemplate jdbcTemplate;

 private final String SQL_FIND_BOOK_BY_ID="select * from book where id=?";
 private final String SQL_FIND_ALL_BOOKS="select * from book";
 private final String SQL_DELTE_BOOK="delete from book where id= ?";
 private final String SQL_INSERT_BOOK="insert into book(id, name, isbn) values(?,?,?)";

 public Book getBookById(Integer id) {
  Book book = this.jdbcTemplate.queryForObject(
          SQL_FIND_BOOK_BY_ID,
          new Object[]{id},
          new BookMapper());
  return book;
 }

 public List<Book> getAllBooks() {
  return this.jdbcTemplate.query(SQL_FIND_ALL_BOOKS, new BookMapper());
 }

 @Override
 public boolean deleteBook(Book book) {
  return this.jdbcTemplate.update(SQL_DELTE_BOOK, book.getId() ) > 0 ;
 }

 @Override
 public boolean createBook(Book book) {
  return this.jdbcTemplate.update(SQL_INSERT_BOOK, book.getId() , book.getName(), book.getIsbn() ) > 0;
 }

 @Override
 public boolean updateBook(Book book) {
  return false;
 }
}
