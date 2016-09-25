package com.sis.resttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sis.resttest.controllers.TeamRestServiceController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {
	
	static Logger logger = LoggerFactory.getLogger(TeamRestServiceController.class);
 
    public static void main(String[] args) {
    	logger.info("Starting SIS Team web service application.");
        SpringApplication.run(Application.class, args); 
        logger.info("SIS Team web service application STARTED.");
    }
    
}
