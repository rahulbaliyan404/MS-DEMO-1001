package com.home.logic;

import java.util.List;
import java.util.Optional;

import com.home.dto.UserDto;
import com.home.entity.UserEntity;

public interface UserLogic {

	Optional<UserEntity> getUserById(int id);

	List<UserEntity> getUsers();

	 UserEntity saveUser(UserDto user);

	String deleteUser(int id);

	UserEntity loginUser(UserEntity user);

}
