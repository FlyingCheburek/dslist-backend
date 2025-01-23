package com.intensivojavaspring.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    @Column(nullable = false)
    private Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.position = position;
    }
}
