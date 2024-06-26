package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Signup;
import com.app.service.UserService;

@RestController
@RequestMapping("/users")
public class UserSignInSignUpController {
	@Autowired
	private UserService userService;
	
	//sign up
	@PostMapping("/signup")
	public ResponseEntity<?> userSignup(@RequestBody @Valid Signup dto){
		System.out.println("in sign up "+dto);
		return ResponseEntity.
				status(HttpStatus.CREATED).
				body(userService.userRegistration(dto));		
	}

}
