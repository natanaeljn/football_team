package entities;

import java.util.ArrayList;
import java.util.List;

public class club {
	private String nameOfClub;
	private Double founds;

	List<jogador> player = new ArrayList<>();

	public club() {

	}

	public club(String nameOfClub, Double founds) {
		super();
		this.nameOfClub = nameOfClub;
		this.founds = founds;
	}

	public String getNameOfClub() {
		return nameOfClub;
	}

	public void setNameOfClub(String nameOfClub) {
		this.nameOfClub = nameOfClub;
	}

	public Double getFounds() {
		return founds;
	}

	public void setFounds(Double founds) {
		this.founds = founds;
	}

	public List<jogador> getPlayer() {
		return player;
	}

	public void addList(jogador players) {
		player.add(players);
	}

	public void removerList(jogador players) {
		player.remove(players);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name of club:" + nameOfClub + "\n");
		sb.append("founds :" + founds + "\n");
		sb.append("list of players:\n");
		for (jogador players : player) {
			sb.append(players + "\n");

		}
		return sb.toString();

	}

}
