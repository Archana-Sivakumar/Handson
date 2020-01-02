package com.cognizant.moviecruiser.dto;

import java.util.List;

import com.cognizant.moviecruiser.model.Movies;

public class FavoritesDTO {

	private List<Movies> movieList;
	private int noOfFavorites;
	
	public FavoritesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FavoritesDTO(List<Movies> movieList, int noOfFavorites) {
		
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

	@Override
	public String toString() {
		return "FavoritesDTO [movieList=" + movieList + ", noOfFavorites=" + noOfFavorites + "]";
	}

	
}