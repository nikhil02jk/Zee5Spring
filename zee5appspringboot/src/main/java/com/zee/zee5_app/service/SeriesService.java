package com.zee.zee5_app.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.naming.NameNotFoundException;

import com.zee.zee5_app.repository.SeriesRepository;
import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidIdLengthException;

public interface SeriesService {
	
	public String addSeries(Series series); 
	public String deleteSeries(String id) throws IdNotFoundException;
	public String modifySeries(String id, Series series) throws IdNotFoundException;
	public Optional<Series> getSeriesById(String id) throws IdNotFoundException, NameNotFoundException, InvalidIdLengthException;
	public Optional<List<Series>> getAllSeries() throws NameNotFoundException, InvalidIdLengthException;

}