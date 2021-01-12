package com.mukeshmahara.springrestapi.dao;

import com.mukeshmahara.springrestapi.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Integer> {
}
