package com.cognizant.moviecruiser.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.moviecruiser.MovieCruiserApplication;
import com.cognizant.moviecruiser.model.Movies;
import com.cognizant.moviecruiser.repository.MoviesRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);

	@Autowired
	private MoviesRepository moviesRepository;
	
	@Override
	public List<Movies> getMovieListAdmin() {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		
		return moviesRepository.findAll();
	}

	@Override
	public List<Movies> getMovieListCustomer() {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		
		return moviesRepository.getMovieListCustomer();
	}

	@Override
	public Movies editMovieList(Movies movies) {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		
		return moviesRepository.save(movies);
		
		
	}

	@Override
	public Movies getOneMovie(int movieId) {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		
		return moviesRepository.findById(movieId).get();
	}

	@Override
	public List<String> getGenreList() {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		
		return moviesRepository.getGenreArray();
	}
}
