package com.intensivojavaspring.dslist.dtos;

import com.intensivojavaspring.dslist.entities.Game;

public record GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
    public GameMinDTO(final Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
}
