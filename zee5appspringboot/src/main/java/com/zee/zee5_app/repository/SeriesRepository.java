package com.zee.zee5_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series, String> {
	
	Optional<Series> findBySeriesNameAndLanguage(String seriesName, String language);

}