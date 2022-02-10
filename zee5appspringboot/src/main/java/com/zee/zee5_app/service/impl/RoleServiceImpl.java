package com.zee.zee5_app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zee.zee5_app.dto.User;
import com.zee.zee5_app.dto.Role;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidEmailException;
import com.zee.zee5_app.exception.InvalidIdLengthException;
import com.zee.zee5_app.exception.InvalidNameException;
import com.zee.zee5_app.exception.InvalidPasswordException;
import com.zee.zee5_app.repository.RoleRepository;
import com.zee.zee5_app.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository repository;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public String addRole(Role role) {
		// TODO Auto-generated method stub
		Role role2 = repository.save(role);
		if(role2!=null)
			return "roles added";
		return "fail";
	}

	@Override
	public void deleteRole(int roleId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Role> optional;
		optional = this.getRoleById(roleId);
		if(optional.isEmpty()) {
			throw new IdNotFoundException("record not found");
		}
		else {
			repository.deleteById(roleId);
			
	}
}
	
	public Optional<Role> getRoleById(int roleId) {
		return repository.findById(roleId);
}

}