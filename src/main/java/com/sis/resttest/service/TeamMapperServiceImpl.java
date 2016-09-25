package com.sis.resttest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sis.resttest.exception.TeamException;
import com.sis.resttest.model.Player;
import com.sis.resttest.model.Team;


@Service
public class TeamMapperServiceImpl implements TeamMapperService {

	private static Map<String, Team> TEAMS;

	static {				
		Map<String, Team> map = new HashMap<>();
		map.put("Manchester United", new Team("Manchester United", "Manchester", "Owner 1", "Premier League", Arrays.asList(new Player("Wayne Rooney"), new Player("Paul Pogba"), new Player("Juan Mata")), "06/01/1904"));
		map.put("Manchester City", new Team("Manchester City", "Manchester", "Owner 2", "Premier League", Arrays.asList(new Player("Sergio Aguero"), new Player("Yaya Touré"), new Player("Nolito")), "08/23/1907"));
		map.put("Chelsea", new Team("Chelsea", "London", "Owner 3", "Premier League", Arrays.asList(new Player("Diego Costa"), new Player("David Luiz"), new Player("Pedro")), "06/30/1916"));
		TEAMS = Collections.unmodifiableMap(map);
	}

	@Override
	public Team getTeam(String teamName) throws TeamException{
		Team team = TEAMS.get(teamName);
		if (team==null) {
			throw new TeamException("Team " + teamName + " does not exist");
		}
		return team;
	}

	@Override
	public List<Team> getAllTeams() {
		return new ArrayList<Team>(TEAMS.values()); 
	}

}
