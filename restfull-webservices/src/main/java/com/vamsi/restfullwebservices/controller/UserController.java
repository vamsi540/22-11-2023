package com.vamsi.restfullwebservices.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamsi.restfullwebservices.UserDto.UserDto;
import com.vamsi.restfullwebservices.entity.User;
import com.vamsi.restfullwebservices.service.UserService;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@RestController 
@RequestMapping("api/users")
public class UserController {
	private UserService userService;
	@PostMapping
	public ResponseEntity<UserDto> createuser(@RequestBody UserDto user){
		UserDto saveduser=userService.createUser(user);
		return new ResponseEntity<>(saveduser,HttpStatus.CREATED);
		
	}
	@GetMapping("{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
		UserDto user= userService.getUserById(userId);
		return new ResponseEntity<>(user,HttpStatus.OK);
		
	}
	@GetMapping
	public ResponseEntity<List<UserDto>> getAllUsers(){
		List<UserDto> users= userService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
		
	}
	@PutMapping("{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,@RequestBody UserDto user) {
		user.setId(userId);
		UserDto updatedUser=userService.updateUser(user);
		return new ResponseEntity<>(updatedUser,HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
		userService.deleteUser(userId);
	return new ResponseEntity<>("user successfully deleted! ",HttpStatus.OK);
}
}
