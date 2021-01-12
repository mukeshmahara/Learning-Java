package com.mukeshmahara.springrestapi.controllers;


import com.mukeshmahara.springrestapi.entities.Book;
import com.mukeshmahara.springrestapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class bookController {
    @Autowired
    BookService bookService;
//    @Autowired
//    BookRepo bookRepo;

    @RequestMapping(path = "/getbooks",method=RequestMethod.GET)
    public List getbooks() {  //It will get all the books we have
        return this.bookService.getbooks();
    }

    @RequestMapping(path = "/getbook/{book_id}",method = RequestMethod.GET)
    public Book getbook(@PathVariable String book_id) {
        return bookService.getbook(Long.parseLong(book_id));
    }

    @RequestMapping(path = "/addbooks", consumes = "application/json", method=RequestMethod.POST)
    public Book addbooks(@RequestBody Book book) {
        return this.bookService.addbooks(book);
    }

    @RequestMapping(path = "/updatebooks", method=RequestMethod.POST)
    public Book updatebooks(@RequestBody Book book) {
        return this.bookService.updatebook(book);

    }

    @GetMapping("/deletebook/{book_id}")
    public Book deletebook(int book_id){
        return this.bookService.deletebook(book_id);

    }

}
