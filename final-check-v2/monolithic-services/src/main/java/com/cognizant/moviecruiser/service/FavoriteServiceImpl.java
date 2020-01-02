package com.cognizant.moviecruiser.service;

import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.moviecruiser.MovieCruiserApplication;
import com.cognizant.moviecruiser.exception.FavoriteEmptyException;
import com.cognizant.moviecruiser.model.Movies;
import com.cognizant.moviecruiser.model.Users;
import com.cognizant.moviecruiser.repository.MoviesRepository;
import com.cognizant.moviecruiser.repository.UserRepository;


@Service
public class FavoriteServiceImpl implements FavoriteService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MoviesRepository moviesRepository;

	@Override
	public boolean addFavoriteList(String userName, int movieId) {
		
		LOGGER.info("Start"); 
		
		boolean addFavorite = true;
		
		Users user = userRepository.findByUserName(userName);
		Set<Movies> movieList = new HashSet<Movies>();
		movieList = user.getMovieList();
		Movies oneMovie = moviesRepository.findById(movieId).get();
		
		if(movieList.size()==0) {
			
			movieList.add(oneMovie);
			user.setMovieList(movieList);
			userRepository.save(user);
			addFavorite = true;
			
		} else {
			
			int flag =0;
			for(Movies movie: movieList) {
				if(movie.getId()==movieId) {
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				movieList.add(oneMovie);
				user.setMovieList(movieList);
				userRepository.save(user);
				addFavorite = true;
			} else {
				addFavorite = false;
			}
		}
		
		LOGGER.info("End");
		return addFavorite;
	}

	@Override
	public Set<Movies> getAllFavoriteList(String userName) throws FavoriteEmptyException {
		
		LOGGER.info("Start"); 
		
		Users user = userRepository.findByUserName(userName);

		if (user.getMovieList().isEmpty()) {
			
			FavoriteEmptyException favoriteEmpty = new FavoriteEmptyException();
			throw favoriteEmpty;
			
		} else {
			LOGGER.info("End");
			
			return user.getMovieList();
		}
		
	}

	@Override
	public Set<Movies> removeFavoriteList(String userName, int movieId) {
		
		LOGGER.info("Start"); 
		
		Users user = userRepository.findByUserName(userName);

		Set<Movies> movieList = new HashSet<Movies>();
		movieList = user.getMovieList();
		boolean flag = false;
		for (Movies movie : movieList) {
			if (movie.getId() == movieId) {
				flag = movieList.remove(movie);
				break;
			}
		}
		if (flag) {
			user.setMovieList(movieList);
			userRepository.save(user);
		}
		LOGGER.info("End");
		return movieList;
		
		
		
	}
	
}
