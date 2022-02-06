package com.zee.zee5_app.service;

import java.util.List;
import java.util.Optional;

import javax.naming.NameNotFoundException;

import com.zee.zee5_app.dto.Episode;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidIdLengthException;

public interface EpisodeService {
	
	public String addEpisode(Episode episode);
	public String deleteEpisode(String id) throws IdNotFoundException;
	public String modifyEpisode(String id, Episode episode) throws IdNotFoundException;
	public Optional<Episode> getEpisodeById(String id) throws IdNotFoundException, NameNotFoundException, InvalidIdLengthException;
	public Optional<List<Episode>> getAllEpisode() throws InvalidIdLengthException;

}