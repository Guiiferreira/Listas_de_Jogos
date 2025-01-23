package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable //encapsulando dois atributos em um só
public class BelongingPK {
	//chave primária multipla
	
	//mapeamento para dois campos de chave estrangeira
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList lis;
	
	
	public BelongingPK() {
		
		
	}


	public BelongingPK(Game game, GameList lis) {
		super();
		this.game = game;
		this.lis = lis;
	}


	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}


	public GameList getLis() {
		return lis;
	}


	public void setLis(GameList lis) {
		this.lis = lis;
	}


	@Override
	public int hashCode() {
		return Objects.hash(game, lis);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(lis, other.lis);
	}
	

}
