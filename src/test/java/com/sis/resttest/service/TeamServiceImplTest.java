package com.sis.resttest.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.sis.resttest.exception.TeamException;
import com.sis.resttest.model.Player;
import com.sis.resttest.model.Team;


@RunWith(MockitoJUnitRunner.class)
public class TeamServiceImplTest {

	private TeamServiceImpl teamServiceImpl;

	@Mock
	private TeamMapperService teamMapperServiceImpl;

	@Before
	public void setUp() {
		teamMapperServiceImpl = mock(TeamMapperServiceImpl.class);
		teamServiceImpl = new TeamServiceImpl(teamMapperServiceImpl);
	}

	@Test
	public void shouldReturnManchesterUnited() throws Exception {
		when(teamMapperServiceImpl.getTeam("Manchester United")).thenReturn(new Team("Manchester United", "Manchester", "Owner 1", "Premier League", Arrays.asList(new Player("Wayne Rooney"), new Player("Paul Pogba"), new Player("Juan Mata")), "06/01/1904"));
		Team teamManchester = teamServiceImpl.getTeam("Manchester United");
		assertThat(teamManchester.getName(), equalTo("Manchester United"));
	}

	@Test(expected = TeamException.class)
	public void shouldThrowTeamException() throws Exception {
		when(teamMapperServiceImpl.getTeam("Real Madrid")).thenThrow(new TeamException("Team does not exist"));
		Team team = teamServiceImpl.getTeam("Real Madrid");
		fail();
	}
}
