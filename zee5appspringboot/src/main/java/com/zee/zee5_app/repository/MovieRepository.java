package com.zee.zee5_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.zee5_app.dto.Movie;

public interface MovieRepository extends JpaRepository<Movie, String> {

}
