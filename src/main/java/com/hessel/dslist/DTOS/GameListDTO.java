package com.hessel.dslist.DTOS;

import com.hessel.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	public GameListDTO(GameList gamelist) {
		id = gamelist.getId();
		name = gamelist.getName();
	}
	public GameListDTO() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
