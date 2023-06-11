package com.example.webTinTuc.controller;

import com.example.webTinTuc.model.Article;
import com.example.webTinTuc.repository.ArticleRepository;
import com.example.webTinTuc.service.ArticlesService;
import com.example.webTinTuc.service.AuthorService;
import com.example.webTinTuc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/articles")
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleController {
    @Autowired
    private ArticlesService articlesService;
    @GetMapping
    public List<Article> getAllArticles() {
        return articlesService.getAllArticles();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable long id) {
        Article article = articlesService.getArticleById(id);
        return ResponseEntity.ok(article);
    }
    @PostMapping("/create/{category_id}/{author_id}")
    public  Article creatArticle(@RequestBody Article article , @PathVariable long category_id, @PathVariable long author_id){
        Article article1 = articlesService.addArticle(article, category_id, author_id);
        return  article1;
    }

    @PutMapping("/{id}")
    public Article updateArticle(@RequestBody Article article, @PathVariable long id){
       Article article1= articlesService.updateArticle(id, article);
        return article1;
    }

    @DeleteMapping("/{id}")
    public String deleteArticle(@PathVariable long id){
        articlesService.deleteArticle(id);
        return "Xóa thành công";
    }




}
