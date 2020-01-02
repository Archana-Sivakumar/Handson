package com.cognizant.movieCruiserAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieCruiserAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserAuthenticationApplication.class, args);
	}

}
