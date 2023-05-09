package com.hessel.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hessel.dslist.DTOS.GameMinDTO;
import com.hessel.dslist.entities.Game;
import com.hessel.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRep;

	public List<GameMinDTO> findAllMin(){
		List<Game> resultFull=gameRep.findAll();
		List<GameMinDTO> resultMin = resultFull.stream().map(x -> new GameMinDTO(x)).toList();
		return resultMin;
	}
	public List<Game> findAll(){
		List<Game> result=gameRep.findAll();
		return result;
	}

}
