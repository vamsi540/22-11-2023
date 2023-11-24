package com.vamsi.restfullwebservices.service;

import java.util.List;

import com.vamsi.restfullwebservices.UserDto.UserDto;
import com.vamsi.restfullwebservices.entity.User;

public interface UserService {
UserDto createUser(UserDto user);


UserDto getUserById(Long userId);

List<UserDto> getAllUsers();

UserDto updateUser(UserDto user); 

void deleteUser(Long userId);
	
}
