package com.optimusprime.demoEx.repositories;

import com.optimusprime.demoEx.module.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
