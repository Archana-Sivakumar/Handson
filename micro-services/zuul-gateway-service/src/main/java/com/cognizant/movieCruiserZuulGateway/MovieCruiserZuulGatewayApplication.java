package com.cognizant.movieCruiserZuulGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy 
public class MovieCruiserZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserZuulGatewayApplication.class, args);
	}

}
