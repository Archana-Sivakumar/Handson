package com.cognizant.moviecruiser.dao;

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cognizant.moviecruiser.MovieCruiserApplication;
import com.cognizant.moviecruiser.exception.FavoriteEmptyException;
import com.cognizant.moviecruiser.model.Favorites;
import com.cognizant.moviecruiser.model.Movies;*/

//@Repository
public class FavoritesDaoCollectionImpl implements FavoritesDao {
	
	/*private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);
	
	private static Map<String, Favorites> userFavorites;

	public FavoritesDaoCollectionImpl() {
		if (userFavorites == null) {
			userFavorites = new HashMap<String, Favorites>();
		}
	}

	public static Map<String, Favorites> getUserFavorites() {
		return userFavorites;
	}

	public static void setUserFavorites(Map<String, Favorites> userFavorites) {
		FavoritesDaoCollectionImpl.userFavorites = userFavorites;
	}

	@Override
	public boolean addFavoriteList(String user, long movieId)  {

		LOGGER.info("Start");
		
		boolean addFavorite = true;
		int flag =0;
		
		MoviesDao moviesDao = new MoviesDaoCollectionImpl();
		Movies movie = moviesDao.getOneMovie(movieId);

		if (userFavorites.containsKey(user)) {
			
			Favorites favorite = userFavorites.get(user);
			for (int i = 0; i < favorite.getMovieList().size(); i++) {
				if (favorite.getMovieList().get(i).getId() == movieId) {
					flag = 1;
					break;	
				}
			}
			if(flag==1) {
				addFavorite = false;
			}
					
			if(flag==0) {
				favorite.getMovieList().add(movie);
				addFavorite = true;
		    } 
		} else {
			Favorites favorite = new Favorites(new ArrayList<Movies>(), 0);
			favorite.getMovieList().add(movie);
			userFavorites.put(user, favorite);
			addFavorite = true;
		}
		
		LOGGER.info("End");
		return addFavorite;
	}

	@Override
	public  List<Movies> getAllFavoriteList(String user) throws FavoriteEmptyException {
		
		LOGGER.info("Start");
		
		if (userFavorites.isEmpty()) {
			FavoriteEmptyException favoriteEmpty = new FavoriteEmptyException();
			throw favoriteEmpty;
		}
		else {
			int noOfFavorites = 0;
			Favorites favorite = userFavorites.get(user);
			
			List<Movies> movie = favorite.getMovieList();
	
			if (movie.isEmpty()) {
				FavoriteEmptyException favoriteEmpty = new FavoriteEmptyException();
				throw favoriteEmpty;
			} else {
				for (int i = 0; i < movie.size(); i++) {
					noOfFavorites++;
					
				}
				favorite.setNoOfFavorites(noOfFavorites);
				favorite.setMovieList(movie);
			}
			
			LOGGER.info("End");
			return movie;
	   }
	}
	
	@Override
	public  List<Movies> removeFavoriteList(String user, long movieId) {

		LOGGER.info("Start");
		
		Favorites favorite = userFavorites.get(user);
		List<Movies> movie = favorite.getMovieList();

		for (int i = 0; i < movie.size(); i++) {
			if (movie.get(i).getId() == movieId) {
				movie.remove(i);
				break;
			}
		}
		
		LOGGER.info("End");
		return movie;
	}*/

}
