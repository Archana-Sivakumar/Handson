package com.cognizant.moviecruiser.service;

import java.util.Set;
import com.cognizant.moviecruiser.exception.FavoriteEmptyException;
import com.cognizant.moviecruiser.model.Movies;

public interface FavoriteService {
	
	public boolean addFavoriteList(String user, int movieId);

	public Set<Movies> getAllFavoriteList(String user) throws FavoriteEmptyException;

	public Set<Movies> removeFavoriteList(String user, int movieId);
}
