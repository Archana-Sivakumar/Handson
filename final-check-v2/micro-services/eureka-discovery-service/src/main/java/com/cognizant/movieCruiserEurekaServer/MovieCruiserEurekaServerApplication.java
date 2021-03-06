package com.cognizant.movieCruiserEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieCruiserEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserEurekaServerApplication.class, args);
	}

}
