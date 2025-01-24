package com.intensivojavaspring.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intensivojavaspring.dslist.dtos.GameListDTO;
import com.intensivojavaspring.dslist.entities.GameList;
import com.intensivojavaspring.dslist.repositories.GameListRepository;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).collect(Collectors.toList());
    }
}
