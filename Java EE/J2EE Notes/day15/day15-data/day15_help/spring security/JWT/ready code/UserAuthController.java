package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Signup;
import com.app.service.UserEntityService;

@RestController
@RequestMapping("/users")
public class UserAuthController {

	@Autowired
	private UserEntityService userService;

	// add end point for user registration
	@PostMapping("/signup")
	public ResponseEntity<?> userRegistration(@RequestBody @Valid Signup request) {
		System.out.println("in user reg " + request);
		return ResponseEntity.ok(userService.registerUser(request));
	}

}
