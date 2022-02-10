package com.zee.zee5_app.security.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtUtils {
	
	
	private static final Logger LOGGER= LoggerFactory.getLogger(JwtUtils.class);
	
	@Value("${zee5_app.app.jwtSecret}")
	private String jwtSecret;
	
	@Value("${zee5_app.app.jwtExpirationMs}")
	private int jwtExpiryValue;

}
