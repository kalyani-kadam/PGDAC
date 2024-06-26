package com.blogs.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blogs.entities.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	//depcy 
	@Autowired
	private SessionFactory factory;

	@Override
	public List<Category> listAllCategories() {
		String jpql="select c from Category c";
		return factory.getCurrentSession()
				.createQuery(jpql,Category.class)
				.getResultList();
	}

}
