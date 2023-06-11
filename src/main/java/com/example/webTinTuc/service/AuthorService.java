package com.example.webTinTuc.service;

import com.example.webTinTuc.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthor();
    Author getAuthorById(long id);
    Author addAuthor(Author name);
    Author updateAuthor(long id, Author author);
    void deleteAuthor(long id);

}
