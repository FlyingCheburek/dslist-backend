package com.intensivojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intensivojavaspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {  }
