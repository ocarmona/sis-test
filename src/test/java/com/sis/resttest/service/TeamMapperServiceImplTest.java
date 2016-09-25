package com.sis.resttest.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sis.resttest.exception.TeamException;
import com.sis.resttest.model.Team;


public class TeamMapperServiceImplTest {


	private TeamMapperServiceImpl teamMapperService;

	@Before
	public void setUp() {
		teamMapperService = new TeamMapperServiceImpl();
	}

	@Test
	public void shouldReturnChelsea() throws TeamException {
		Team actual = teamMapperService.getTeam("Chelsea");
		assertThat(actual.getName(), equalTo("Chelsea"));
	}

	@Test
	public void shouldReturnAllTeams() throws TeamException {
		List<Team> actual = teamMapperService.getAllTeams();
		Team team = teamMapperService.getTeam("Manchester United");
		assertThat(actual, not(hasSize(0)));
		assertThat(actual, hasItem(team));
		team = teamMapperService.getTeam("Manchester City");
		assertThat(actual, hasItem(team));
		team = teamMapperService.getTeam("Chelsea");
		assertThat(actual, hasItem(team));
	}
}
