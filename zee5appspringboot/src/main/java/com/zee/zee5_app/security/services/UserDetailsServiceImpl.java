package com.zee.zee5_app.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zee.zee5_app.dto.User;
import com.zee.zee5_app.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByUserName(userName).orElseThrow(() -> new UsernameNotFoundException("user not found with username: "+ userName));
	
		return UserDetailsImpl.build(user);
	}

}