package com.blogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//it will start spring boot application by its own
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
