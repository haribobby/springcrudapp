package com.emp.springcrudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emp.springcrudapp.builder.UserBuilder;
import com.emp.springcrudapp.dto.UserDTO;
import com.emp.springcrudapp.model.User;
import com.emp.springcrudapp.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserBuilder userBuilder;

	@Override
	public Long createUser(User user) {

		User savedUser = userRepository.save(user);

		return savedUser.getId();
	}

	@Override
	//@Cacheable("userCache")
	public List<UserDTO> getAllUsers() {
		System.out.println("@@@@@@@@@@@@@@@ getAll Users...............");
		List<UserDTO> userDTOList = userBuilder.buildEntityListToDTOList(userRepository.findAll());
		return userDTOList;
	}

	@Override
	public User getUserById() {
		return null;
	}

}
