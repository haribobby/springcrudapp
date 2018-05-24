package com.emp.springcrudapp.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.emp.springcrudapp.dto.UserDTO;
import com.emp.springcrudapp.model.User;

@Component
public class UserBuilder {

	public List<UserDTO> buildEntityListToDTOList(List<User> userList) {
		List<UserDTO> userDTOList = null;
		if (Objects.nonNull(userList)) {
			userDTOList = new ArrayList<>();
			for (User user : userList) {
				UserDTO userDto = new UserDTO();
				userDto.setAddress(user.getAddress());
				userDto.setId(user.getId());
				userDto.setName(user.getName());
				userDTOList.add(userDto);
			}
		}

		return userDTOList;
	}
}
