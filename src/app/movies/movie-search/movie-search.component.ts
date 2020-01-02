import { Component, OnInit, Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-movie-search',
  templateUrl: './movie-search.component.html',
  styleUrls: ['./movie-search.component.css']
})
export class MovieSearchComponent implements OnInit {

  @Output() searchEmitter: any;
  searchString: string ="";
  
  constructor() { 
    this.searchEmitter = new EventEmitter();  
  }

  ngOnInit() {
  }

  filterData() {
    this.searchEmitter.emit(this.searchString);
  }
}
