package com.cognizant.moviecruiser.model;

import java.util.List;

public class Favorites {
	
	private List<Movies> movieList;
	private int noOfFavorites;

	public Favorites(List<Movies> movieList, int noOfFavorites) {
		
		this.movieList = movieList;
		this.noOfFavorites = noOfFavorites;
	}

	public List<Movies> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movies> movieList) {
		this.movieList = movieList;
	}

	public int getNoOfFavorites() {
		return noOfFavorites;
	}

	public void setNoOfFavorites(int noOfFavorites) {
		this.noOfFavorites = noOfFavorites;
	}

}