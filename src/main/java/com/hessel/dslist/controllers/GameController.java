package com.hessel.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hessel.dslist.DTOS.GameMinDTO;
import com.hessel.dslist.entities.Game;
import com.hessel.dslist.services.GameService;

@RestController
@RequestMapping(value="/games")
public class GameController {

	@Autowired
	private GameService gameService;
	@GetMapping (value="all")
	public List<Game> findAll(){
		return gameService.findAll();
	}
	@GetMapping (value="allmin")
	public List<GameMinDTO> findMinAll(){
		return gameService.findAllMin();
	}
}
