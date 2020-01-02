package com.cognizant.moviecruiser.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.moviecruiser.MovieCruiserApplication;
import com.cognizant.moviecruiser.model.Movies;
import com.cognizant.moviecruiser.security.AppUserDetailsService;
import com.cognizant.moviecruiser.service.MovieService;


@RestController
@RequestMapping("/movie-cruiser")
public class MoviesController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	@GetMapping("/movie-list")
	public List<Movies> getAllMovieList() {
		
		LOGGER.info("Start");
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String user = authentication.getName();
		
		if(user!="anonymousUser") {
			
			UserDetails userDetails = appUserDetailsService.loadUserByUsername(authentication.getName());
			String role = userDetails.getAuthorities().toArray()[0].toString();
			
			if (role.equals("ADMIN")) {
				
				LOGGER.info("End");
				return movieService.getMovieListAdmin();
				
			} else {
				
				LOGGER.info("End");
				return movieService.getMovieListCustomer();
			}
			
		} else {
			
			LOGGER.info("End");
			return movieService.getMovieListCustomer();
		}
		
	}
	
	@GetMapping("/movie-list/{id}")
	public Movies getOneMovie(@PathVariable int id) {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		return movieService.getOneMovie(id);
	}

	@PutMapping("/movie-list")
	public Movies editMovieList(@RequestBody Movies movie) {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		
		return movieService.editMovieList(movie);
		
	}
	
	@GetMapping("/genre")
	public List<String> getGenreList() {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		return movieService.getGenreList();
	}

}
