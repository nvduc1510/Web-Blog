package com.example.webTinTuc.service;

import com.example.webTinTuc.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(int id);
    void addCategory(Category name);
    void uppdateCategory(int id, Category category);
    void deleteCategory(int id);

}
