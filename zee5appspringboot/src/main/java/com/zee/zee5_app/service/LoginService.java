package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Login;
import com.zee.zee5_app.dto.EROLE;
import com.zee.zee5_app.exception.IdNotFoundException;

public interface LoginService {
	
	public String addCredentials(Login login);
	public String deleteCredentials(String username) throws IdNotFoundException;
	public String changePassword(String username,String password);
	public String changeRole(String username, EROLE role);

}