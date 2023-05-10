package com.hessel.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hessel.dslist.DTOS.GameDTO;
import com.hessel.dslist.DTOS.GameMinDTO;
import com.hessel.dslist.entities.Game;
import com.hessel.dslist.repositories.GameRepository;



@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRep;

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAllMin(){
		List<Game> resultFull=gameRep.findAll();
		List<GameMinDTO> resultMin = resultFull.stream().map(x -> new GameMinDTO(x)).toList();
		return resultMin;
	}
	
	@Transactional(readOnly = true)
	public List<Game> findAll(){
		List<Game> result=gameRep.findAll();
		return result;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRep.findById(id).get();
		return new GameDTO(result);
				
	}
}
