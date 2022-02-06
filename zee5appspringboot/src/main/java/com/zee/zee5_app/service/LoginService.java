package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Login;
import com.zee.zee5_app.dto.EROLE;

public interface LoginService {
	public String addCredentials(Login login);
	public String deleteCredentials(String userName);
	public String changePassword(String userName, String password);
	public String changeRole(String userName, EROLE role);
	

}