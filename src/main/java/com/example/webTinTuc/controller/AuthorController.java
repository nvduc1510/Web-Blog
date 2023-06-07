package com.example.webTinTuc.controller;

import com.example.webTinTuc.entity.Articles;
import com.example.webTinTuc.entity.Author;
import com.example.webTinTuc.service.ArticlesService;
import com.example.webTinTuc.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;
    @GetMapping
    public List<Author> getAllAuthor(){
        return authorService.getAllAuthor();
    }

    @GetMapping("/{id}")
    public Author getAllAuthor(@PathVariable int id){
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public void addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
    }

    @PutMapping("/{id}")
    public  void updateAuthor(@PathVariable int id, @RequestBody Author author){
        authorService.updateAuthor(id,author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id){
        authorService.deleteAuthor(id);
    }
}
