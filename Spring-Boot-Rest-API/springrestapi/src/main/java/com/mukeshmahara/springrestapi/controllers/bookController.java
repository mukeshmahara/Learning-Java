package com.mukeshmahara.springrestapi.controllers;


import com.mukeshmahara.springrestapi.entities.Book;
import com.mukeshmahara.springrestapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class bookController {
    @Autowired
    BookService bookService;

    @GetMapping("/getbooks")
    public List getbooks(){  //It will get all the books we have
        return this.bookService.getbooks();
    }

    @GetMapping("/getbook/{book_id}")
    public Book getbook(@PathVariable String book_id){
        return bookService.getbook(Long.parseLong(book_id));
    }

    @GetMapping(path="/books", consumes = "application/json")
        public Book addbooks(@RequestBody Book book){
        return this.bookService.addbooks(book);
        }

}
