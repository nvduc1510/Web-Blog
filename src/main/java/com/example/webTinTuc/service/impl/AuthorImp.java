package com.example.webTinTuc.service.impl;

import com.example.webTinTuc.entity.Author;
import com.example.webTinTuc.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorImp implements AuthorService {
    private List<Author> authors = new ArrayList<>();
    @Override
    public List<Author> getAllAuthor() {
        return authors;
    }

    @Override
    public Author getAuthorById(int id) {
        for (Author author : authors){
            if(author.getId() == id){
                return  author;
            }
        }
        return null;
    }

    @Override
    public void addAuthor(Author author) {
        authors.add(author);

    }

    @Override
    public void updateAuthor(int id, Author author) {
        for (Author a : authors) {
            if (a.getId() ==id){
                a.setName(author.getName());
            }
        }
    }

    @Override
    public void deleteAuthor(int id) {
        authors.removeIf(a -> a.getId() ==id);
    }
}
