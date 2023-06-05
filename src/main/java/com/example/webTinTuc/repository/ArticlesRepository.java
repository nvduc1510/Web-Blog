package com.example.webTinTuc.repository;

import com.example.webTinTuc.entity.Articles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesRepository  extends JpaRepository<Articles, Long> {
}
