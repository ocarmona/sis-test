package com.sis.resttest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sis.resttest.exception.TeamException;
import com.sis.resttest.model.Team;

@Service
public class TeamServiceImpl implements TeamService {

	private TeamMapperService teamMapperService;

	@Autowired
	public TeamServiceImpl(TeamMapperService teamMapperService) {
		super();
		this.teamMapperService = teamMapperService;
	}

	@Override
	public Team getTeam(String teamName) throws TeamException {
		return teamMapperService.getTeam(teamName);
	}

	@Override
	public List<Team> getAllTeams() throws TeamException {
		return teamMapperService.getAllTeams();
	}

}
