package com.blogs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exceptions.ResorceNotFoundException;
import com.blogs.entities.Category;
import com.blogs.repository.CategoryRepository;

@Service
@Transactional // implementation classes annotation is required
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category addNewCategory(Category newCategory) {
		// public T save(T entity)
		return categoryRepository.save(newCategory);
	}

	@Override
	public String deleteCategoryDetails(Long catId) {
		if (categoryRepository.existsById(catId)) {
			// ApI of CrudRepo - public void deleteById(ID id)
			categoryRepository.deleteById(catId);
			return "Category details deleted";
		}
		return "deleting category details failed : Invalid category ID";
	}

	@Override
	public Category getCategoryDetails(Long categoryId) {
		//inherited method - Optional<Category> findById(Long catId)
		Optional<Category> optional = categoryRepository.findById(categoryId);
		return optional.orElseThrow(() -> new ResorceNotFoundException("Invalid category Id"));
	}

	@Override
	public Category updateCategoryDetails(Category category) {
		//CRUDRepository : save
		return categoryRepository.save(category);
	}
}
