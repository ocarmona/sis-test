package com.sis.resttest.model;

import java.util.List;

public class Team {

	private String name;
	private String city;
	private String owner;
	private String competition;
	private List<Player> playersList;
	private String creationDate;
	
	public Team(String name, String city, String owner, String competition,	
						List<Player> playersList, String creationDate) {
		this.name = name;
		this.city = city;
		this.owner = owner;
		this.competition = competition;
		this.playersList = playersList;
		this.creationDate = creationDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCompetition() {
		return competition;
	}
	public void setCompetition(String competition) {
		this.competition = competition;
	}
	public List<Player> getPlayersList() {
		return playersList;
	}
	public void setPlayersList(List<Player> playersList) {
		this.playersList = playersList;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

}
