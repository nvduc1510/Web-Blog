package com.example.webTinTuc.service;

import com.example.webTinTuc.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(long id);
    Category CreateCategory(Category name);
    Category updateCategory(long id, Category category);
    void deleteCategory(long id);

}
