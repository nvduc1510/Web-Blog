package com.example.webTinTuc.service.impl;

import com.example.webTinTuc.model.Category;
import com.example.webTinTuc.repository.CategoryRepository;
import com.example.webTinTuc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryImp implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll() ;
    }

    @Override
    public Category getCategoryById(long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }

    @Override
    public Category CreateCategory(Category name) {
        Category category = new Category();
        category.setName(name.getName());
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(long id, Category category) {
        Optional<Category> category1 = categoryRepository.findById(id);
        if(category1.isPresent()){
            Category restart = category1.get();
            restart.setName(category.getName());
            categoryRepository.save(restart);
        }
        return category;
    }

    @Override
    public void deleteCategory(long id) {
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isPresent()){
            Category restart = category.get();
            categoryRepository.delete(restart);
        }
    }


}
