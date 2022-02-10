package com.zee.zee5_app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.naming.NameNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5_app.dto.EROLE;
import com.zee.zee5_app.dto.Episode;
import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.User;
import com.zee.zee5_app.dto.Role;
import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.exception.AlreadyExistsException;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidAmountException;
import com.zee.zee5_app.exception.InvalidEmailException;
import com.zee.zee5_app.exception.InvalidIdLengthException;
import com.zee.zee5_app.exception.InvalidNameException;
import com.zee.zee5_app.exception.InvalidPasswordException;
import com.zee.zee5_app.repository.MovieRepository;
import com.zee.zee5_app.repository.RoleRepository;
import com.zee.zee5_app.repository.SeriesRepository;
import com.zee.zee5_app.repository.UserRepository;
import com.zee.zee5_app.service.EpisodeService;
import com.zee.zee5_app.service.LoginService;
import com.zee.zee5_app.service.MovieService;
import com.zee.zee5_app.service.RoleService;
import com.zee.zee5_app.service.SeriesService;
import com.zee.zee5_app.service.SubscriptionService;
import com.zee.zee5_app.service.UserService;
import com.zee.zee5_app.service.impl.MovieServiceImpl;
import com.zee.zee5_app.service.impl.SeriesServiceImpl;
import com.zee.zee5_app.service.impl.SubscriptionServiceImpl;
import com.zee.zee5_app.utils.Fileutils;

@SpringBootApplication
public class Zee5appspringbootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(Zee5appspringbootApplication.class,
				args);


	}

}