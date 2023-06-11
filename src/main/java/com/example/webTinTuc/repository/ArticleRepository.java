package com.example.webTinTuc.repository;

import com.example.webTinTuc.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article, Long> {


}