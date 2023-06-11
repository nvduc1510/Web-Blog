package com.example.webTinTuc.service;

import com.example.webTinTuc.model.Article;


import java.util.List;


public interface ArticlesService {
    List<Article> getAllArticles();
    Article getArticleById(long id);
    Article addArticle(Article article, long category_id, long author_id);
    Article updateArticle(long id, Article article);
    void deleteArticle(long id);


}
