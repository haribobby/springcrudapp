package com.emp.springcrudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
/*
 * @author Hari
 */
@SpringBootApplication
@EnableCaching
public class SpringcrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcrudappApplication.class, args); 
	}
}
