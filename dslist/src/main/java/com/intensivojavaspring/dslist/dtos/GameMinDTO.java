package com.intensivojavaspring.dslist.dtos;

import com.intensivojavaspring.dslist.entities.Game;
import com.intensivojavaspring.dslist.projections.GameMinProjection;

public record GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
    public GameMinDTO(final Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
    public GameMinDTO(final GameMinProjection projection) {
        this(projection.getId(), projection.getTitle(), projection.getYear(), projection.getImgUrl(), projection.getShortDescription());
    }
}
