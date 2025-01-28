package com.alt3rs.dslist.repositories;

import com.alt3rs.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
