package com.intensivojavaspring.dslist.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intensivojavaspring.dslist.dtos.GameMinDTO;
import com.intensivojavaspring.dslist.repositories.GameRepository;
import com.intensivojavaspring.dslist.entities.Game;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
