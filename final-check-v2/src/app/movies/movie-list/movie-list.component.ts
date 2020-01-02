import { Component, OnInit } from '@angular/core';
import { MovieService } from '../movie.service';
import { Router } from '@angular/router';
import { FavoriteService } from 'src/app/favorites/favorite.service';
import { AuthService } from 'src/app/site/auth.service';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {

  movieList: any;
  filteredMovieList: any;
  favoriteMsg: any;
  addedMovieId: number;
  userRoleName: string;

  constructor(private movieService:MovieService,private router:Router,private favoriteService:FavoriteService,private authService:AuthService) { 
      this.userRoleName = authService.userName;
  }

  ngOnInit() {

      this.movieService.getAllMovieList()
        .subscribe((response)=>{
            this.movieList = response;
            this.filteredMovieList =  this.movieList;
      });
  }

  addToFavorite(id) {
    if(this.authService.isLoggedIn()) {  
        this.favoriteService.addFavoriteMovie(id).subscribe((response)=>
        {
            this.favoriteMsg= response;
            this.addedMovieId = id;
        });
    }
    else {
      this.authService.anonymousUserStatus(true);
      this.router.navigate(["login"]);
    }
  }

  editMovieList(id) {
    this.router.navigate(["edit-movie",id]);
  }

  search(searchString) {
    let filterMovie = searchString.toLocaleLowerCase();
    this.filteredMovieList = this.movieService.getFilterMovie(this.movieList,filterMovie);
  }

  seatAvailStatus(id) {

    if(this.authService.isLoggedIn()) {
      this.router.navigate(["seat",id]);
    }
    else {
      this.authService.seatStatus(true);
      this.router.navigate(["login"]);
    }

  }
}
