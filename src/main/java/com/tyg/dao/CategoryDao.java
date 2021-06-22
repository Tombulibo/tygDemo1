package com.tyg.dao;

import com.tyg.pojo.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getCategories();
    Category getCategoryByID(Integer cateID);
    int updateCategory(Category category);
    int addCategory(Category category);
    int deleteCategory(Category category);
}
