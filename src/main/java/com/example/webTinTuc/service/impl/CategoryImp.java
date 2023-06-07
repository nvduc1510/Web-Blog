package com.example.webTinTuc.service.impl;

import com.example.webTinTuc.entity.Category;
import com.example.webTinTuc.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryImp implements CategoryService {
    private List<Category> categories = new ArrayList<>();
    @Override
    public List<Category> getAllCategories() {
        return categories ;
    }

    @Override
    public Category getCategoryById(int id) {
        for(Category category : categories){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }

    @Override
    public void addCategory(Category category) {
        categories.add(category);
    }

    @Override
    public void uppdateCategory(int id, Category category) {
        for(Category c : categories){
            if(c.getId() == id){
                c.setName(category.getName());
            }
        }
    }
    @Override
    public void deleteCategory(int id) {
        categories.removeIf(a -> a.getId() ==id);

    }
}
