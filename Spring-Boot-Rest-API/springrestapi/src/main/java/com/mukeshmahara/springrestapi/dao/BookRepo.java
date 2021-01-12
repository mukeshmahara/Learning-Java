package com.mukeshmahara.springrestapi.dao;

import com.mukeshmahara.springrestapi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
