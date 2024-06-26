package com.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.dto.Signup;
import com.app.entities.UserRole;

@SpringBootTest
class TestUserService {

	@Autowired
	private UserEntityService userService;

	@Test
	public void testAddAdminDetails() {
		Signup admin = new Signup("Meera", "Seth", "meera@gmail.com", "xyz#1234", UserRole.ROLE_ADMIN);
		Signup entity = userService.registerUser(admin);
		assertEquals(1, entity.getId());

	}

	@Test
	public void testAddCustomerDetails() {
		Signup customer = new Signup("Riya", "Kadam", "riya@gmail.com", "abc#1234", UserRole.ROLE_CUSTOMER);
		Signup entity = userService.registerUser(customer);
		assertEquals(2, entity.getId());

	}

	@Test
	public void testAddUserDetails() {
		Signup customer = new Signup("Mihir", "Patil", "mihir@gmail.com", "def#1234", UserRole.ROLE_CUSTOMER);
		Signup entity = userService.registerUser(customer);
		assertEquals(4, entity.getId());

	}

}
