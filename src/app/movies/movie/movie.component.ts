import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { MovieList } from '../movieList';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {

  @Input() movie:any;
  @Input() favoriteMsg: boolean;
  @Input() addedMovieId: number;
  @Input() userRoleName:string;

  @Output() seatAvailabilty: any;
  @Output() editEmitter: any;
  @Output() addEmitter: any;

  constructor() {
    this.editEmitter = new EventEmitter();
    this.addEmitter = new EventEmitter();
    this.seatAvailabilty = new EventEmitter();
  }

  ngOnInit() {
  }
  
  addFavorite(id){
    this.addEmitter.emit(id);
  }

  editMovie(id) {
    this.editEmitter.emit(id);
  }
  
  seatStatus(id) {
    this.seatAvailabilty.emit(id);
  }
}
