//package net.javaguides.springboot;
package com.springboot.empcurd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		System.out.println("Employee CRUD - Spring Boot Server Start");
	}

}
