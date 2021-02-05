package com.BookCrudProject.controller;

import com.BookCrudProject.service.BookService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookController extends AbstractController {
    public BookService bookService;

    public BookController() {
    }
    public BookController(BookService bookService) {
        this.bookService=bookService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

       ModelAndView modelAndView=new ModelAndView("book");
       modelAndView.addObject("table","this is table");
        return modelAndView;
    }
}
