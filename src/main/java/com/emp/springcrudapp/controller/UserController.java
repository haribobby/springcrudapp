package com.emp.springcrudapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.springcrudapp.model.User;
import com.emp.springcrudapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@SuppressWarnings("rawtypes")
	@PostMapping
	public ResponseEntity createUser(@RequestBody User user) {
		
		//Test t = new Test();

		LOGGER.info("UserController:::createUser:::User obj is..." + user);
		return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
	}

	//@SuppressWarnings("rawtypes")
	@GetMapping
	public ResponseEntity getAllUsers() {
		return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getUserById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
