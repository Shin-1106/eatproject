package com.example.eatproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.example.eatproject.entity")
@SpringBootApplication
public class EatprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EatprojectApplication.class, args);
	}

}
