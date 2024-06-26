package com.blogs.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blogs.entities.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	//depcy 
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Category> listAllCategories() {
		String jpql="select c from Category c";
		return entityManager
				.createQuery(jpql,Category.class)
				.getResultList();
	}

}
