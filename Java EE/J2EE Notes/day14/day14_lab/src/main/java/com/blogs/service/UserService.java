package com.blogs.service;

import com.blogs.dto.AuthDTO;
import com.blogs.dto.UserRespDTO;

public interface UserService {

	UserRespDTO authenticateUser(AuthDTO dto);

}
