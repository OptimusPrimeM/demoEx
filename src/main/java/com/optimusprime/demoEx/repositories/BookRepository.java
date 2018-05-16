package com.optimusprime.demoEx.repositories;

import com.optimusprime.demoEx.module.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
