package com.cognizant.moviecruiser.dao;

/*import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import com.cognizant.moviecruiser.MovieCruiserApplication;
import com.cognizant.moviecruiser.model.Movies;*/


//@Repository
public class MoviesDaoCollectionImpl implements MoviesDao {
	
	/*private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);
	
	private static List<Movies> movieList;

	public MoviesDaoCollectionImpl() {

		ApplicationContext contextMenuItem = new ClassPathXmlApplicationContext("moviecruiser.xml");
		movieList = (ArrayList) contextMenuItem.getBean("movieList");
	}

	public static List<Movies> getMovieList() {
		return movieList;
	}

	public static void setMovieList(List<Movies> movieList) {
		MoviesDaoCollectionImpl.movieList = movieList;
	}

	@Override
	public List<Movies> getMovieListAdmin() {
		
		LOGGER.info("Start");
		LOGGER.info("End");
		return movieList;
	}

	@Override
	public List<Movies> getMovieListCustomer() {

		LOGGER.info("Start");
		
		List<Movies> filteredMovieList = new ArrayList<Movies>();
		
		for (Movies movie : movieList) {
			int dateCompare = movie.getDateOfLaunch().compareTo(new Date());
			if (movie.isActive() == true && (dateCompare == 0 || dateCompare < 0)) {
				filteredMovieList.add(movie);
			}
		}
		LOGGER.info("End");
		return filteredMovieList;
	}

	@Override
	public boolean editMovieList(Movies movie) {
		
		LOGGER.info("Start");
		
		int i;
		for (i = 0; i < movieList.size(); i++) {
			if (movie.getId() == movieList.get(i).getId()) {
				movieList.set(i, movie);
				break;
			}
		}
		
		LOGGER.info("End");
		return true;

	}

	@Override
	public Movies getOneMovie(long movieId) {

		LOGGER.info("Start");
		
		int i;
		Movies movie = null;
		for (i = 0; i < movieList.size(); i++) {
			if (movieId == movieList.get(i).getId()) {
				movie = movieList.get(i);
				break;
			}
		}
		
		LOGGER.info("End");
		return movie;
	}*/

}
