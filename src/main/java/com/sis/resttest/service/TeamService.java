package com.sis.resttest.service;

import java.util.List;

import com.sis.resttest.exception.TeamException;
import com.sis.resttest.model.Team;


public interface TeamService {
	Team getTeam(String teamName) throws TeamException;

	List<Team> getAllTeams() throws TeamException;
}
