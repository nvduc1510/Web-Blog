package com.example.webTinTuc.service.impl;

import com.example.webTinTuc.entity.Articles;

import com.example.webTinTuc.service.ArticlesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ArticlesImp implements ArticlesService {
    private List<Articles> articles = new ArrayList<>();


    @Override
    public List<Articles> getAllArticles() {
        return articles;
    }

    @Override
    public Articles getArticleById(int id) {
        for(Articles article : articles){
            if(article.getId() == id){
                return article;
            }
        }
        return null;
    }

    @Override
    public void addArticle(Articles article) {
        articles.add(article);
    }

    @Override
    public void updateArticle(int id, Articles article) {
        for(Articles a : articles){
            if(a.getId() ==id){
                a.setTile(article.getTile());
                a.setContent(article.getContent());
                a.setAuthor_id(article.getAuthor_id());
                a.setCategory_id(article.getCategory_id());
                a.setCreat_at(article.getCreat_at());
            }
        }
    }

    @Override
    public void deleteArticle(int id) {
        articles.removeIf(a -> a.getId() ==id);

    }
}
