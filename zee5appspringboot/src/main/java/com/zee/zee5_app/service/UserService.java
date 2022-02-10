package com.zee.zee5_app.service;

import java.util.Optional;

import com.zee.zee5_app.dto.User;
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
//	public User addUser(User register) throws AlreadyExistsException;
//	public User updateUser(String id, User register) throws IdNotFoundException;
//	public User getUserById(String id) throws IdNotFoundException;
//	public User[] getAllUsers() throws InvalidIdLengthException, InvalidNameException, InvalidEmailException, InvalidPasswordException;
//	public String deleteUserById(String id) throws IdNotFoundException;
//	public Optional<List<User>> getAllUserDetails();
	
	public User addUser(User register) throws AlreadyExistsException;
	public User updateUser(String id, User register) throws IdNotFoundException;
	public User getUserById(String id) throws IdNotFoundException;
	public User[] getAllUsers() throws InvalidIdLengthException, InvalidNameException, InvalidEmailException, InvalidPasswordException;
	public String deleteUserById(String id) throws IdNotFoundException;
	public Optional<List<User>> getAllUserDetails();
}