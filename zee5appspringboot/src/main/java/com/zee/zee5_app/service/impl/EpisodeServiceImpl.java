package com.zee.zee5_app.service.impl;

import java.util.List;
import java.util.Optional;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5_app.dto.Episode;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidIdLengthException;
import com.zee.zee5_app.repository.EpisodeRepository;
import com.zee.zee5_app.service.EpisodeService;

@Service
public class EpisodeServiceImpl implements EpisodeService {
	
	@Autowired
	private EpisodeRepository repository;

	@Override
	public String addEpisode(Episode episode) {
		// TODO Auto-generated method stub
		Episode episode2 = repository.save(episode);
		if (episode2 != null) {
			return "success";
		} else {
			return "fail";
		}
	}

	@Override
	public String deleteEpisode(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Episode> optional;
		try {
			optional = this.getEpisodeById(id);
			if(optional.isEmpty()) {
				throw new IdNotFoundException("record not found");
			}
			else {
				repository.deleteById(id);
				return "register record deleted";
			}
		} catch (IdNotFoundException | InvalidIdLengthException | NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IdNotFoundException(e.getMessage());
		}
	}

	@Override
	public String modifyEpisode(String id, Episode episode) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Episode> getEpisodeById(String id)
			throws IdNotFoundException, NameNotFoundException, InvalidIdLengthException {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Optional<List<Episode>> getAllEpisode() throws InvalidIdLengthException {
		// TODO Auto-generated method stub
		return Optional.ofNullable(repository.findAll());
	}

}