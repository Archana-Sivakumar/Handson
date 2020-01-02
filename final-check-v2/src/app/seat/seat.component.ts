import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-seat',
  templateUrl: './seat.component.html',
  styleUrls: ['./seat.component.css']
})

export class SeatComponent implements OnInit {

    movieList: any;
    id:any;
    rows: string[] = ['A', 'B', 'C', 'D', 'E'];
    cols: number[]  = [1, 2, 3, 4, 5];

    reserved: string[] = ['A2', 'A3','B2', 'D6','E5', 'E2'];
    selected: string[] = [];

    ticketPrice: number = 120;
    
    constructor() { }

    ngOnInit() { }

    seatClicked(seatPosition) {
        var index = this.selected.indexOf(seatPosition);
        
        if(index != -1) {
            this.selected.splice(index, 1);
        } else {
            if(this.reserved.indexOf(seatPosition) == -1)
                this.selected.push(seatPosition);
        }
    }

    getSeatStatus(seatPosition) {
        if(this.reserved.indexOf(seatPosition) != -1) {
            return 'reserved';
        } else if(this.selected.indexOf(seatPosition) != -1) {
            return 'selected';
        }
    }

    showSelectedSeats() {
        if(this.selected.length > 0) {
            alert("Selected Seats: " + this.selected + "\nTotal: "+(this.ticketPrice * this.selected.length));
        } else {
            alert("No seats selected!");
        }
    }
    
}
