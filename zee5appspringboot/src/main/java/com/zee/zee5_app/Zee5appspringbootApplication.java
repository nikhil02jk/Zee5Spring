package com.zee.zee5_app;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5_app.dto.Episode;
import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.dto.Role;
import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.exception.AlreadyExistsException;
import com.zee.zee5_app.repository.RoleRepository;
import com.zee.zee5_app.service.EpisodeService;
import com.zee.zee5_app.service.SeriesService;
import com.zee.zee5_app.service.SubscriptionService;
import com.zee.zee5_app.service.UserService;

@SpringBootApplication
public class Zee5appspringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(Zee5appspringbootApplication.class, args);
		RoleRepository roleRepository = applicationContext.getBean(RoleRepository.class);
		UserService userService = applicationContext.getBean(UserService.class);
		
		
		
		applicationContext.close();
	}

}