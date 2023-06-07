package com.example.webTinTuc.repository;

import com.example.webTinTuc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category,Long> {
}
