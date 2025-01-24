package com.intensivojavaspring.dslist.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intensivojavaspring.dslist.dtos.GameDTO;
import com.intensivojavaspring.dslist.dtos.GameMinDTO;
import com.intensivojavaspring.dslist.repositories.GameRepository;

import com.intensivojavaspring.dslist.entities.Game;
import com.intensivojavaspring.dslist.projections.GameMinProjection;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public GameDTO findById(final Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> searchByList(final Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
