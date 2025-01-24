package com.intensivojavaspring.dslist.dtos;

import com.intensivojavaspring.dslist.entities.Game;

public record GameDTO(Long id, String title, Long score, Integer year, String genre, String platforms, String imgUrl, String shortDescription, String longDescription) {
    public GameDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getScore(), game.getYear(), game.getGenre(), game.getPlatforms(), game.getImgUrl(), game.getShortDescription(), 
            game.getLongDescription());
    }
}
