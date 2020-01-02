import { Injectable } from '@angular/core';
import { AuthService } from '../site/auth.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class FavoriteService {
  
  favoriteMsg: boolean= false;
  
  constructor(private authService:AuthService,private httpClient:HttpClient) { }

    addFavoriteMovie(id) {

        let token = 'Bearer '+this.authService.getToken();
        let user = this.authService.getRole();
            const httpOptions ={
                headers: new HttpHeaders({
                    'Content-Type': 'application/json',
                    'Authorization': token
                })
            };        
        return this.httpClient.post(environment.movieListUrl+"/favorite-list/"+user+"/"+id,{},httpOptions);
    }
    
    getFavoriteList(){

        let token = 'Bearer '+this.authService.getToken();
        let user = this.authService.getRole();
            const httpOptions ={
                headers: new HttpHeaders({
                    'Content-Type': 'application/json',
                    'Authorization': token
                })
            };
                    
        return this.httpClient.get(environment.movieListUrl+"/favorite-list/"+user, httpOptions);
    }
    
    calculateNoOfFavorites(favoriteMovie) {
        this.favoriteMsg = true;
        return favoriteMovie.length;  
    }

    deleteFavoriteMovie(id){

        let token = 'Bearer '+this.authService.getToken();
        let user = this.authService.getRole();
            const httpOptions ={
                headers: new HttpHeaders({
                    'Content-Type': 'application/json',
                    'Authorization': token
                })
            };
                    
        return this.httpClient.delete(environment.movieListUrl+"/favorite-list/"+user+"/"+id, httpOptions);
    }
}

