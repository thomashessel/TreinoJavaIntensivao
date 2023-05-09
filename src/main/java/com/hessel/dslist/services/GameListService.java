package com.hessel.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hessel.dslist.DTOS.GameListDTO;
import com.hessel.dslist.entities.GameList;
import com.hessel.dslist.repositories.GameListRepository;


@Service
public class GameListService {

	@Autowired
	private GameListRepository gameRep;

	public List<GameListDTO> findAll(){
		List<GameList> result=gameRep.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	public GameListDTO findById(Long id) {
		GameList result =gameRep.findById(id).get();
		return new GameListDTO(result);
	}
	
}