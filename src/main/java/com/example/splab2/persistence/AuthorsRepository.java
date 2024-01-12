package com.example.splab2.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.splab2.model.Author;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}
