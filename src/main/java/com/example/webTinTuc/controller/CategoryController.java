package com.example.webTinTuc.controller;

import com.example.webTinTuc.model.Article;
import com.example.webTinTuc.model.Category;
import com.example.webTinTuc.repository.CategoryRepository;
import com.example.webTinTuc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public List<Category> getAllCategory(){

        return categoryService.getAllCategories();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable long id){
        Category category = categoryService.getCategoryById(id);
        return ResponseEntity.ok(category);
    }



    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestBody Category category ){
        Category category1 = categoryService.CreateCategory(category);
        return ResponseEntity.ok(category1);
    }

    @PutMapping("/update/{id}")
    public Category updateCategory(@RequestBody Category category, @PathVariable long id ){
        Category category1 = categoryService.updateCategory(id,category);
        return category1;
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable long id) {
        categoryService.deleteCategory(id);
        return "Xóa thành công";
    }
}