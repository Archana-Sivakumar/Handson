import { Component, OnInit } from '@angular/core';
import { FavoriteService } from '../favorite.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-favorite',
  templateUrl: './favorite.component.html',
  styleUrls: ['./favorite.component.css']
})
export class FavoriteComponent implements OnInit {

  favoriteMovie: any;
  noOfFavorites : number;
  favoriteStatus: boolean;
  error: string;

  constructor(private favoriteService:FavoriteService,private router: Router) { 
      this.favoriteService.getFavoriteList().subscribe((response)=>{
          this.favoriteMovie = response;
          this.noOfFavorites = favoriteService.calculateNoOfFavorites(this.favoriteMovie);
        },
        (responseError)=>{
          this.error = responseError.error.message;
        });
    
  }

  ngOnInit() {
  }
 
  removeFromFavorites(id){

    this.favoriteService.deleteFavoriteMovie(id).subscribe((response)=>{
      this.favoriteMovie = response;
      this.noOfFavorites = this.favoriteService.calculateNoOfFavorites(this.favoriteMovie);
      this.favoriteStatus = this.favoriteService.favoriteMsg;
    });
  
  }
}
