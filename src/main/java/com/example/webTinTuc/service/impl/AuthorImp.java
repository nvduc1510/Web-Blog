package com.example.webTinTuc.service.impl;

import com.example.webTinTuc.model.Author;
import com.example.webTinTuc.repository.AuthorRepository;
import com.example.webTinTuc.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorImp implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthorById(long id) {
        Optional<Author> author = authorRepository.findById(id);
        return author.get();
    }

    @Override
    public Author addAuthor(Author name) {
        Author author = new Author();
        author.setName(name.getName());
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(long id, Author author) {
        Optional<Author> author1 = authorRepository.findById(id);
        if(author1.isPresent())
        {
            Author restart = author1.get();
            restart.setName(author.getName());
            authorRepository.save(restart);
        }
        return author;
    }

    @Override
    public void deleteAuthor(long id) {
        Optional<Author> author = authorRepository.findById(id);
        Author rs = author.get();
        authorRepository.delete(rs);
    }
}
