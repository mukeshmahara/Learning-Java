package com.mukeshmahara.springrestapi.services;

import com.mukeshmahara.springrestapi.dao.BookRepo;
import com.mukeshmahara.springrestapi.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
//    private List<Book> list;
    @Autowired
    private BookRepo bookRepo;

    //    Author author = new Author();
    public BookServiceImpl() {
//        list = new ArrayList<>();
//        list.add(new Book(143,
//                "Java",
//                "Kathmandu Publication",
//                new Author(
//                        123,
//                        "Mukesh",
//                        "Mahara",
//                        "Kirtipur, Kathmandu",
//                        "mukeshmahara1@gmail.com",
//                        24,
//                        "Male",
//                        "9868772852")));
//
//        list.add(new Book(1,
//                "Kotlin",
//                "Kathmandu Publication",
//                new Author(
//                        10,
//                        "Sushil",
//                        "Bajracharya",
//                        "Bhaktapur, Kathmandu",
//                        "sushil@gmail.com",
//                        24,
//                        "Male",
//                        "9808782892")));
    }

    @Override
    public List<Book> getbooks() {
        return (List<Book>) bookRepo.findAll();
    }

    @Override
    public Book getbook(long book_id) {
//        Book b = null;
//        for (Book book : list) {
//            if (book.getBook_id() == book_id) {
//                System.out.println("Book Found with id :" + book_id);
//                b = book;
//                break;
//            }
//        }
        Book book = bookRepo.getOne((int)book_id);
        System.out.println(book.getBook_name()+" is the book with book_id :"+book_id);
        return bookRepo.getOne((int) book_id);
    }

    @Override
    public Book addbooks(Book book) {
//        list.add(book);
        System.out.println(book.getBook_name()+" Book has been added..");
        bookRepo.save(book);
        return book;
    }

    @Override
    public Book deletebook(int book_id) {
        Book book = bookRepo.getOne(book_id);
        bookRepo.delete(book);
        System.out.println(book.toString()+" has been deleted! ");
        return book;
    }

    @Override
    public Book updatebook(Book book) {
//        for (Book b : list) {
//            if (b.getBook_id()== book.getBook_id()){
//                b.setBook_name(book.getBook_name());
//                b.setPublication(book.getPublication());
//                b.setAuthor(book.getAuthor());
//                break;
//            }
//        }
        System.out.println("Book has been updated...");
        bookRepo.save(book);
        return book;
    }

}
