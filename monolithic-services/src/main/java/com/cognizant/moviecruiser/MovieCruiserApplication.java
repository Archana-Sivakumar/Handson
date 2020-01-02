package com.cognizant.moviecruiser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MovieCruiserApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);
	
	public static void main(String[] args) {
		
		LOGGER.info("Start");
		SpringApplication.run(MovieCruiserApplication.class, args);
		LOGGER.info("End");

	}

}


		
		
		
	

