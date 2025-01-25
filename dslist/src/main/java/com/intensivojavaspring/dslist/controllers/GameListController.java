package com.intensivojavaspring.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensivojavaspring.dslist.dtos.GameListDTO;
import com.intensivojavaspring.dslist.dtos.GameMinDTO;
import com.intensivojavaspring.dslist.dtos.ReplacementDTO;
import com.intensivojavaspring.dslist.services.GameListService;
import com.intensivojavaspring.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists") // --> http://localhost:8080/lists
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games") // --> http://localhost:8080/lists/{listId}/games
    public List<GameMinDTO> findByList(@PathVariable final Long listId) {
        return gameService.searchByList(listId);
    }

    @PostMapping("/{listId}/replacement")
    public void moveGame(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.moveGame(listId, body.srcIndex(), body.destIndex()); 
    }
}
