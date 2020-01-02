import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MovieService } from '../movie.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-movie-edit',
  templateUrl: './movie-edit.component.html',
  styleUrls: ['./movie-edit.component.css']
})
export class MovieEditComponent implements OnInit {

  movieList: any;
  id:any;
  movieListForm : any;
  editMsg: any;
  activeStatus ="No";
  hasTeaserStatus = "No";
  constructor(private router: ActivatedRoute,private movieService:MovieService,private route: Router) {

    this.movieListForm = new FormGroup({
        "title" : new FormControl(""),
        "boxOffice" : new FormControl(""),
        "dateOfLaunch" : new FormControl(""),
        "genre" : new FormControl(""),
        "active" : new FormControl(""),
        "hasTeaser" : new FormControl("")
    })
  }

  ngOnInit() {
    let activeStatus = false;
    let hasTeaserStatus =  false;

      this.router.paramMap.subscribe(params=> {
          this.id = params.get("movieId");
      })

      this.movieService.getOneMovie(this.id).subscribe((response)=>{
          this.movieList = response;        

          if(this.movieList.active=="Yes") {
             activeStatus =true
          }
          if(this.movieList.hasTeaser=="Yes") {
            hasTeaserStatus =true
          }

          this.movieListForm = new FormGroup({
              "title" : new FormControl(this.movieList.title,[Validators.required,Validators.minLength(2)]),
              "boxOffice" : new FormControl(this.movieList.boxOffice,[Validators.required]),
              "dateOfLaunch" : new FormControl(this.movieList.dateOfLaunch,[Validators.required]),
              "genre" : new FormControl(this.movieList.genre),
              "active" : new FormControl(activeStatus),
              "hasTeaser" : new FormControl(hasTeaserStatus)
           
          })
        })
  }
  
  updateMovieList(id,movieListForm) {
   
      if(movieListForm.active==true) {
        this.activeStatus ="Yes"
      }
      if(movieListForm.hasTeaser==true) {
        this.hasTeaserStatus ="Yes"
      }
      
      let edittedMovie:any={
          id : id,
          title: movieListForm.title,
          boxOffice :movieListForm.boxOffice,
          active : this.activeStatus,
          dateOfLaunch : movieListForm.dateOfLaunch,
          genre : movieListForm.genre,
          hasTeaser : this.hasTeaserStatus,
          imageUrl: this.movieList.imageUrl
      }

      this.movieService.updateMovie(edittedMovie).subscribe(response=>{
        
            this.editMsg = true;
      });

  }  

}
