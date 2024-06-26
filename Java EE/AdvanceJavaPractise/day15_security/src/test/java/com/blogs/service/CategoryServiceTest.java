package com.blogs.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blogs.dto.CategoryDTO;

@SpringBootTest //annotation for the spring boot test frmwork to enable
//all spring beans including -controller,service n dao beans
class CategoryServiceTest {
	@Autowired
	private CategoryService categoryService;
	

	@Test
	void test() {
		assertNotNull(categoryService);
	}
	@Test
	void testGetAllCategories() {
		List<CategoryDTO> list = categoryService.getAllCategories();
		assertEquals(4, list.size());
		//not a good pattern !(should not display any resp from test case !!!!!)
		list.forEach(System.out::println);
	}

}
