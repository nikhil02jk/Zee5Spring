package com.zee.zee5_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@PostMapping("/addMovie")
	//used ? so we can return any type
	public ResponseEntity<?> addMovie(@RequestBody Movie movie) {
		
		Movie result = movieService.addMovie(movie);
		return ResponseEntity.status(201).body(result);
	}
}