package com.zee.zee5_app.service;

import java.util.Optional;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.exception.AlreadyExistsException;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidEmailException;
import com.zee.zee5_app.exception.InvalidIdLengthException;
import com.zee.zee5_app.exception.InvalidNameException;
import com.zee.zee5_app.exception.InvalidPasswordException;

import java.util.ArrayList;
import java.util.List;
import com.zee.zee5_app.repository.UserRepository;


public interface UserService {
	public Register addUser(Register register) throws AlreadyExistsException;
	public String updateUser(String id, Register register) throws IdNotFoundException;
	public Register getUserById(String id) throws IdNotFoundException;
	public Register[] getAllUsers() throws InvalidIdLengthException, InvalidNameException, InvalidEmailException, InvalidPasswordException;
	public String deleteUserById(String id) throws IdNotFoundException;
	public Optional<List<Register>> getAllUserDetails();
}