package com.zee.zee5_app.service;

import java.util.List;
import java.util.Optional;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.exception.AlreadyExistsException;
import com.zee.zee5_app.exception.IdNotFoundException;

public interface UserService {
	
	public String addUser(Register register) throws AlreadyExistsException;
	public Optional<Register> getUserById(String id);
	public Register[] getAllUsers();
	public String deleteUserById(String id) throws IdNotFoundException;
	public Optional<List<Register>> getAllUserDetails();

}