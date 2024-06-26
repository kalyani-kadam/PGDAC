package com.app.service;

import com.app.dto.Signup;

public interface UserEntityService {
	Signup registerUser(Signup request);
}
