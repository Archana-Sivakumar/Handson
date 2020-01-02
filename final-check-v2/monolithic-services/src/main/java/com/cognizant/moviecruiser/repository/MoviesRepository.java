package com.cognizant.moviecruiser.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cognizant.moviecruiser.model.Movies;


@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer>{
	
	@Query(nativeQuery=true, value="select mo_id, mo_title, mo_box_office, mo_active, mo_date_of_launch, mo_genre, mo_has_teaser, mo_image_url" + 
			" from `movie_cruiser`.`movie_list`" + 
			"where mo_date_of_launch = NOW()" + 
			"or mo_date_of_launch < NOW()" + 
			"and mo_active = 'Yes'")
	List<Movies> getMovieListCustomer();
	
	@Query(nativeQuery=true, value="select ge_name from `movie_cruiser`.`genre`")
	List<String> getGenreArray();
}
