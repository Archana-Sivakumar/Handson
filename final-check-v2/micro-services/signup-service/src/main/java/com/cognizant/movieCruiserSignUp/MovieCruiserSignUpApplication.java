package com.cognizant.movieCruiserSignUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieCruiserSignUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserSignUpApplication.class, args);
	}

}
