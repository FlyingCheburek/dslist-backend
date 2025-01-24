package com.intensivojavaspring.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensivojavaspring.dslist.dtos.GameDTO;
import com.intensivojavaspring.dslist.dtos.GameMinDTO;
import com.intensivojavaspring.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games") // --> http://localhost:8080/games 
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}") // --> http://localhost:8080/games/{id}
    public GameDTO findById(@PathVariable final Long id) {
        return gameService.findById(id);
    }
}
