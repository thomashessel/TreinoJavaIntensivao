package com.hessel.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hessel.dslist.entities.Game;
import com.hessel.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{

	@Query(nativeQuery = true, value = """
			SELECT ths_game.id, ths_game.title, ths_game.game_year AS 'year', ths_game.img_url AS imgUrl,
			ths_game.short_description AS shortDescription, ths_belonging.position
			FROM ths_game
			INNER JOIN ths_belonging ON ths_game.id = ths_belonging.game_id
			WHERE ths_belonging.game_ls_id =:listId
			ORDER BY ths_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);
}
