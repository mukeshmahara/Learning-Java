package com.mukeshmahara.springrestapi.services;

import com.mukeshmahara.springrestapi.entities.Author;
import com.mukeshmahara.springrestapi.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    List<Book> list;

    //    Author author = new Author();
    public BookServiceImpl() {
        list = new ArrayList<>();
        list.add(new Book(143,
                "Java",
                "Kathmandu Publication",
                new Author(
                        123,
                        "Mukesh",
                        "Mahara",
                        "Kirtipur, Kathmandu",
                        "mukeshmahara1@gmail.com",
                        24,
                        "Male",
                        "9868772852")));

        list.add(new Book(1,
                "Kotlin",
                "Kathmandu Publication",
                new Author(
                        10,
                        "Sushil",
                        "Bajracharya",
                        "Bhaktapur, Kathmandu",
                        "sushil@gmail.com",
                        24,
                        "Male",
                        "9808782892")));
    }

    @Override
    public List<Book> getbooks() {
        return list;
    }

    @Override
    public Book getbook(long book_id) {
        Book b = null;
        for (Book book : list) {
            if (book.getBook_id() == book_id) {

                System.out.println("Book Found with id :" + book_id);
                b = book;
                break;
            }
        }
        return b;
    }

    @Override
    public Book addbooks(Book book) {
        list.add(book);
        return book;
    }

}
