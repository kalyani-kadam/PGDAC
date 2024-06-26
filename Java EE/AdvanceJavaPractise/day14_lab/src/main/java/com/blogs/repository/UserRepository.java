package com.blogs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blogs.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
//add a finder for user login
	Optional<User> findByEmailAndPassword(String em,String pass);

//	@Query("select u from User u where u.email=:em")
//	Optional<User> fetchByEmail(String email);
//	static User findByEmail(String email) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
