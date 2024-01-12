package com.example.splab2.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.splab2.model.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}
