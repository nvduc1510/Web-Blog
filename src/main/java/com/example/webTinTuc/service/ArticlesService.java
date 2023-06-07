package com.example.webTinTuc.service;

import com.example.webTinTuc.entity.Articles;


import java.util.List;


public interface ArticlesService {
    List<Articles> getAllArticles();
    Articles getArticleById(int id);
    void addArticle(Articles article);
    void updateArticle(int id, Articles article);
    void deleteArticle(int id);
}
