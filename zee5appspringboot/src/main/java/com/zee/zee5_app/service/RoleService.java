package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Role;
import com.zee.zee5_app.exception.IdNotFoundException;

public interface RoleService {
	
	public String addRole(Role role);
	public void deleteRole(int roleId) throws IdNotFoundException;

}