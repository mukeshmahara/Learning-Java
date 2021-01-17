package com.mukeshmahara.springrestapi.services;

import com.mukeshmahara.springrestapi.entities.Book;

import java.util.List;

public interface BookService {
    public List<Book> getbooks();

    public Book getbook(long book_id);

    public Book addbooks(Book book);

    Book deletebook(int book_id);

    Book updatebook(Book book);
}
