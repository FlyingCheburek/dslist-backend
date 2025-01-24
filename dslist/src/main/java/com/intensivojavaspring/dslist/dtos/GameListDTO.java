package com.intensivojavaspring.dslist.dtos;

import com.intensivojavaspring.dslist.entities.GameList;

public record GameListDTO(Long id, String name) {
    public GameListDTO(GameList list) {
        this(list.getId(), list.getName());
    }
}
