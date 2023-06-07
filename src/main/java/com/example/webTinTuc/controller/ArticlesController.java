package com.example.webTinTuc.controller;

import com.example.webTinTuc.entity.Articles;
import com.example.webTinTuc.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
@CrossOrigin
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping
    public List<Articles> getAllArticles(){
        return articlesService.getAllArticles();
    }

    @GetMapping("/{id}")
    public Articles getArticleById(@PathVariable int id){
        return articlesService.getArticleById(id);
    }
    @PostMapping
    public void addArticle(@RequestBody Articles article){
        articlesService.addArticle(article);
    }

    @PutMapping("/{id}")
    public void updateArticle(@PathVariable int id , @RequestBody Articles article){
        articlesService.updateArticle(id,article);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable int id){
        articlesService.deleteArticle(id);
    }

}
