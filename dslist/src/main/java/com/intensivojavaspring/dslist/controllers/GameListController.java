package com.intensivojavaspring.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensivojavaspring.dslist.dtos.GameListDTO;
import com.intensivojavaspring.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists") // --> http://localhost:8080/lists
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }
}
