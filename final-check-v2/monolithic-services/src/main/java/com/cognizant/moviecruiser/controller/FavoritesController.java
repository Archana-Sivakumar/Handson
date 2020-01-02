package com.cognizant.moviecruiser.controller;

import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.moviecruiser.MovieCruiserApplication;
import com.cognizant.moviecruiser.exception.FavoriteEmptyException;
import com.cognizant.moviecruiser.model.Movies;
import com.cognizant.moviecruiser.service.FavoriteService;


@RestController
@RequestMapping("/movie-cruiser")
public class FavoritesController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);
	
	@Autowired
	private FavoriteService favoriteService;
	
	@PostMapping("/favorite-list/{user}/{movieId}")
	public boolean addFavoriteList(@PathVariable String user, @PathVariable int movieId) {
		
		LOGGER.info("Start"); 
		LOGGER.info("End");
		
		return favoriteService.addFavoriteList(user, movieId);
		
	}

	@GetMapping("/favorite-list/{user}")
	public Set<Movies> getAllFavoriteList(@PathVariable String user) throws FavoriteEmptyException{
		
		LOGGER.info("Start"); 
		LOGGER.info("End");
		
		return favoriteService.getAllFavoriteList(user);
	}

	@DeleteMapping("/favorite-list/{user}/{movieId}")
	public Set<Movies> removeFavoriteList(@PathVariable String user, @PathVariable int movieId){
		
		LOGGER.info("Start"); 
		LOGGER.info("End");
		
		return favoriteService.removeFavoriteList(user, movieId);
	}

}
