package com.cognizant.movielist.service;

import java.util.Set;

import com.cognizant.movielist.exception.FavoriteEmptyException;
import com.cognizant.movielist.model.Movies;


public interface FavoriteService {
	
	public boolean addFavoriteList(String user, int movieId);

	public Set<Movies> getAllFavoriteList(String user) throws FavoriteEmptyException;

	public Set<Movies> removeFavoriteList(String user, int movieId);
}
