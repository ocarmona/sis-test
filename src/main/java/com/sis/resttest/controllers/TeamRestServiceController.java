package com.sis.resttest.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sis.resttest.exception.TeamException;
import com.sis.resttest.model.Team;
import com.sis.resttest.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class TeamRestServiceController {
	
	@Autowired
	private TeamService teamService;
    Logger logger = LoggerFactory.getLogger(TeamRestServiceController.class);

    @RequestMapping(value="/getTeam/{teamName}", method=RequestMethod.GET)
    public @ResponseBody Team getTeam(@PathVariable("teamName") String teamName) throws TeamException {
        logger.info("/getTeam/" + teamName + "invoked");
    	try {
    		return teamService.getTeam(teamName);
    	}
    	catch (TeamException e) {
    		logger.error("/getTeam:exception: " + e.getMessage());
    		throw e;
    	}
    }
    
    @RequestMapping(value="/getAllTeams", method=RequestMethod.GET)
    public @ResponseBody List<Team> getAllTeams() throws TeamException {
    	logger.info("/getAllTeams invoked");
    	try {
    		return teamService.getAllTeams();
    	}
    	catch (TeamException e) {
    		logger.error("/getAllTeams:exception: " + e.getMessage());
    		throw e;
    	}  	
    }
   
}
