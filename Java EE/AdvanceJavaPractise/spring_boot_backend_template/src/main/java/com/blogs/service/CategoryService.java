package com.blogs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.entities.Category;

public interface CategoryService{
	public List<Category> getAllCategories(); 
	Category addNewCategory(Category newCategory);
	String deleteCategoryDetails(Long catId);
	Category getCategoryDetails(Long categoryId);
	Category updateCategoryDetails(Category category);
}
