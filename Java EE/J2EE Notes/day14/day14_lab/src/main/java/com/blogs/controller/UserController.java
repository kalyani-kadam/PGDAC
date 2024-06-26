package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.AuthDTO;
import com.blogs.dto.UserRespDTO;
import com.blogs.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	/*
	 * Authenticate user 
	 * URL - http://host:port/users/signin 
	 * method - POST (only for
	 * security , later for creating a new resource JWT -Json web token) req - Auth
	 * dto (email , password) resp - success (user resp dto -- fname , last name ,
	 * dob , phoneno) failure - ApiResp --err mesg
	 * 
	 */
	@PostMapping("/signin")
	public ResponseEntity<?> userSignIn(@RequestBody AuthDTO dto) {
		System.out.println("in sigin " + dto);
		try {			
			UserRespDTO respDto = userService.authenticateUser(dto);
			// => success , send resp pkt : SC 200 , resp body - user dto
			return ResponseEntity.ok(respDto);
		} catch (RuntimeException e) {
			//invalid login 
			System.out.println(e);
			// resp pkt - SC 404 api resp with err mesg
			return ResponseEntity.
					status(HttpStatus.NOT_FOUND).
					body(new ApiResponse(e.getMessage()));
		}

	}

}
