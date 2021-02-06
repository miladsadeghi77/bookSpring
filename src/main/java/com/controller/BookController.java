package com.controller;



import com.model.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    public BookService bookService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
   public ModelAndView getAllBooks() {
      List<Book> books = bookService.getAllBooks();
      ModelAndView modelAndView=new ModelAndView("book");
      modelAndView.addObject("books", books);
      return modelAndView;
   }
}
