package com.emp.springcrudapp.controller;

import javax.validation.Valid;

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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/*
@author Mahesh
*/
@RestController
@RequestMapping("/user")
@Api(value = "User Resource", description = "This class is used for  user crud operations")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@SuppressWarnings("rawtypes")
	@PostMapping
	@ApiOperation(value = "Adding an User", notes = "This method is used for creting an user...")
	public ResponseEntity createUser(@RequestBody @Valid User user) {
		
		//Test t = new Test();
		LOGGER.info("UserController:::createUser:::User obj is..." + user);
		return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
	}

	//@SuppressWarnings("rawtypes")
	@GetMapping
	@ApiOperation(value = "All Users", notes = "This method is used for reteriving all users...")
	public ResponseEntity getAllUsers() {
		LOGGER.debug("UserController:::createUser:::User obj is...debug" );
		LOGGER.info("UserController:::createUser:::User obj is...infoo");
		LOGGER.error("UserController:::createUser:::User obj is...error");
		LOGGER.warn("UserController:::createUser:::User obj is...warn");
		//LOGGER.fatal("UserController:::createUser:::User obj is...infoo");
		return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getUserById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
