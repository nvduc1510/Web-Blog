package com.example.webTinTuc.service.impl;

import com.example.webTinTuc.model.Article;

import com.example.webTinTuc.model.Author;
import com.example.webTinTuc.model.Category;
import com.example.webTinTuc.repository.ArticleRepository;
import com.example.webTinTuc.repository.AuthorRepository;
import com.example.webTinTuc.repository.CategoryRepository;
import com.example.webTinTuc.service.ArticlesService;
import com.example.webTinTuc.service.AuthorService;
import com.example.webTinTuc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ArticlesImp implements ArticlesService {
    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private AuthorRepository authorRepository;



    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article getArticleById(long id) {
        Optional<Article> rs = articleRepository.findById(id);
        return  rs.get();
    }

    @Override
    public Article addArticle(Article article, long category_id, long auhtor_id) {
        Article article1 = new Article();
        article1.setTitle(article.getTitle());
        article1.setContent(article.getContent());
        Optional<Category> category =categoryRepository.findById(category_id);
        Optional<Author> author =authorRepository.findById(auhtor_id);
        article1.setCategory(category.get());
        article1.setAuthor(author.get());

        articleRepository.save(article1);

        return article1;
    }

    @Override
    public Article updateArticle(long id, Article article) {
        Article article1 = articleRepository.findById(id).get();
        article1.setTitle(article.getTitle());
        article1.setContent(article.getContent());
        articleRepository.save(article1);

        return article1;

    }

    @Override
    public void deleteArticle(long id) {
        Optional<Article> article1 = articleRepository.findById(id);
        if(article1.isPresent()){
            Article article2 = article1.get();
            articleRepository.delete(article2);
        }

    }
}
