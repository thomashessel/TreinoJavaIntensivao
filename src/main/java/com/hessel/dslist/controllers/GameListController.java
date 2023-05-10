package com.hessel.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hessel.dslist.DTOS.GameListDTO;
import com.hessel.dslist.DTOS.GameMinDTO;
import com.hessel.dslist.services.GameListService;
import com.hessel.dslist.services.GameService;

@RestController
@RequestMapping(value="/gamelist")
public class GameListController {

	@Autowired
	private GameListService gameList;
	@Autowired
	private GameService gameService;
	
	@GetMapping ("/all")
	public List<GameListDTO> findAll(){
		return gameList.findAll();
	}
	@GetMapping ("/{id}")
	public GameListDTO findById(@PathVariable("id") Long id) {
		return gameList.findById(id);
	}
	
	@GetMapping ("/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable("listId") Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
}