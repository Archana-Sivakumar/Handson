import { Injectable } from '@angular/core';
import { MovieList } from './movieList';
import { Observable } from 'rxjs';
import { AuthService } from '../site/auth.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

      movieList: MovieList[];
      customerArray = [];
      editMsg: boolean = false;

      constructor(private authService:AuthService,private httpClient:HttpClient) { }

          getAllMovieList():Observable<any> {
            if(this.authService.userName == 'anonymous') {

              return this.httpClient.get(environment.movieListUrl+"/movie-list");

            } else{

                  let token = 'Bearer '+this.authService.getToken();
                  const httpOptions ={
                    headers: new HttpHeaders({
                      'Content-Type': 'application/json',
                      'Authorization': token
                    })
                  };
                  
                  return this.httpClient.get(environment.movieListUrl+"/movie-list", httpOptions);
            }
      }

      getFilterMovie(movieList,filterMovie) {
        return movieList.filter((movie) => movie.title.toLocaleLowerCase().indexOf(filterMovie)!= -1);
      }

      getOneMovie(id){

        let token = 'Bearer '+this.authService.getToken();
        const httpOptions ={
          headers: new HttpHeaders({
             'Content-Type': 'application/json',
             'Authorization': token
          })
        };
        return this.httpClient.get(environment.movieListUrl+"/movie-list/"+id, httpOptions);
      }
    
      updateMovie(edittedMovie) {
    
        let token = 'Bearer '+this.authService.getToken();
        const httpOptions ={
          headers: new HttpHeaders({
             'Content-Type': 'application/json',
             'Authorization': token
          })
        };
        return this.httpClient.put(environment.movieListUrl+"/movie-list",edittedMovie,httpOptions);
      }

}

