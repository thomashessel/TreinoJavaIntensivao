package com.hessel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hessel.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
