package com.mscatalogo.service;

import com.mscatalogo.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Category> listAllCategory();
    public Category getCategory(Long id);

    public Category createCategory(Category category);
    public Category updateCategory(Category category);
    public void deleteCategory(Long id);
    public Optional<Category> findByCategory(Long id);
}
