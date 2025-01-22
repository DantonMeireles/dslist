package com.a.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_beloging")
public class Beloging {

	@EmbeddedId
	private BelogingPK id = new BelogingPK();

	private Integer position;

	public void setGame(Games game) {
		id.setGame(game);
	}

	public Games getGame() {
		return id.getGame();
	}

	public void setList(GameList list) {
		id.setList(list);
	}

	public GameList getList() {
		return id.getList();
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beloging other = (Beloging) obj;
		return Objects.equals(id, other.id);
	}
}
