package com.cognizant.movielist.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.cognizant.movielist.model.Movies;

@Service
public interface MovieService {
	
	public List<Movies> getMovieListAdmin();

	public List<Movies> getMovieListCustomer();

	public Movies editMovieList(Movies movies);

	public Movies getOneMovie(int movieId);

}
