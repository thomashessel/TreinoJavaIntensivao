package com.hessel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hessel.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
