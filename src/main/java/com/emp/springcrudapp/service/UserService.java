package com.emp.springcrudapp.service;

import java.util.List;

import com.emp.springcrudapp.model.User;

public interface UserService {

	Long createUser(User user);
	
	List<User> getAllUsers();
	
	User getUserById();

}
