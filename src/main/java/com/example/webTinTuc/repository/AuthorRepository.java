package com.example.webTinTuc.repository;

import com.example.webTinTuc.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
