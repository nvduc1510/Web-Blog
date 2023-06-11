package com.example.webTinTuc.repository;

import com.example.webTinTuc.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
