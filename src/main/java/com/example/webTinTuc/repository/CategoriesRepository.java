package com.example.webTinTuc.repository;

import com.example.webTinTuc.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories,Long> {
}
