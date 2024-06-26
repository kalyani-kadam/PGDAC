package com.blogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
