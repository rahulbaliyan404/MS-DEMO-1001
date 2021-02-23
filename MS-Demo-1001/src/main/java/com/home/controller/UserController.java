package com.home.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.dto.UserDto;
import com.home.entity.UserEntity;

@RequestMapping(value = "/demo1001")
public interface UserController {
	
	@GetMapping(value = "/login")
	public UserEntity loginUser(@RequestBody UserEntity userPojo);

	@GetMapping(value = "/user/{id}")
	public Optional<UserEntity> getUserById(@PathVariable("id") int id);

	@GetMapping(value = "/users")
	public List<UserEntity> getUsers();

	@DeleteMapping(value = "/delete/{id}")
	public String deleteUser(@PathVariable("id") int id);
	
	@PutMapping(value = "/update/{id}")
	public String updateUser(@RequestBody UserEntity user,@PathVariable("id") int id);

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UserDto user) throws Exception;

}
