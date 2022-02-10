package com.zee.zee5_app.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration //it will have only security related configurations 
@EnableWebSecurity 
@EnableGlobalMethodSecurity (prePostEnabled=true)
//whether the user is able to access the controller with or without security
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

}
