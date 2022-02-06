package com.zee.zee5_app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zee.zee5_app.dto.Register;

@RestController //Responsebody + controller 
// whenever we want to share the response that method must be marked with @ResponseBody 

@RequestMapping("api/Users")
public class UserController {
	
	//when client sends the request it will be present in the request body in the form of json object
	//we have to transform that json object to java object=>@RequestBody
	
	//get => retrieve => @GetMapping
	//post => create => @postMapping
	//put => modify => @putMapping
	//delete => delete => @deleteMapping
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody Register register) {
		return register.toString();
	}

}
