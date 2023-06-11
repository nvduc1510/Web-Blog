package com.example.webTinTuc.controller;

import com.example.webTinTuc.model.Article;
import com.example.webTinTuc.model.Author;
import com.example.webTinTuc.model.Category;
import com.example.webTinTuc.repository.AuthorRepository;
import com.example.webTinTuc.service.AuthorService;
import com.example.webTinTuc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/")
    public List<Author> getAllAuthor(){

        return authorService.getAllAuthor();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Author> getCategoryById(@PathVariable long id){
        Author author =authorService.getAuthorById(id);
        return ResponseEntity.ok(author);
    }



    @PostMapping("/create")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author ){
        Author author1 = authorService.addAuthor(author);
        return ResponseEntity.ok(author1);
    }

    @PutMapping("/update/{id}")
    public Author updateAuthor(@RequestBody Author author, @PathVariable long id ){
        Author author1 = authorService.updateAuthor(id,author);
        return author1;
    }

    @DeleteMapping("/{id}")
    public String deleteAuthor(@PathVariable long id) {
        authorService.deleteAuthor(id);
        return "Xóa thành công";
    }
}