package com.cognizant.moviecruiser.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.cognizant.moviecruiser.model.Movies;

@Service
public interface MovieService {
	
	public List<Movies> getMovieListAdmin();

	public List<Movies> getMovieListCustomer();

	public Movies editMovieList(Movies movies);

	public Movies getOneMovie(int movieId);
	
	public List<String> getGenreList();
}
