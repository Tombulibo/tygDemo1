package com.tyg.service.impl;

import com.tyg.dao.CategoryDao;
import com.tyg.pojo.Category;
import com.tyg.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getCategories(){
        return categoryDao.getCategories();
    }

    @Override
    public Category getCategoryByID(Integer cateID){
        return categoryDao.getCategoryByID(cateID);
    }

    @Override
    public int updateCategory(Category category){
        return categoryDao.updateCategory(category);
    }

    @Override
    public int addCategory(Category category){
        return categoryDao.addCategory(category);
    }

    @Override
    public int deleteCategory(Category category){
        return categoryDao.deleteCategory(category);
    }
}
