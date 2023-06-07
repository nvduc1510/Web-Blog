package com.example.webTinTuc.service;

import com.example.webTinTuc.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthor();
    Author getAuthorById(int id);
    void addAuthor(Author author);
    void updateAuthor(int id, Author author);
    void deleteAuthor(int id);
}
