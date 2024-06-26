package com.blogs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.User;

public interface UserRepository extends JpaRepository<User, Long> { //JpaRepository is super i/f
	//add a derive finder method for user sign in 
	//instead of optional u can only rets User but u have to do null checking 
	Optional<User> findByEmailAndPassword(String em,String pass); //findBy NameofPropertyAppearsinEntity And = for joining NameofPropertyAppearsinEntity 
	//if wrong email and pass then rets null
}
