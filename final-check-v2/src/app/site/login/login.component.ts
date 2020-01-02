import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  isAnonymousUser: boolean = false;
  name : string = '';
  password: string = '';
  errorMsg: boolean = false;
  isSeatAvail: boolean = false;

  constructor(private router:Router,private authService:AuthService) {
      this.isAnonymousUser = this.authService.isAnonymous;
      this.isSeatAvail = this.authService.isSeatAvail;
  }

  ngOnInit() {
  }
 
  loginDetails() {

    this.authService.authenticate(this.name,this.password)
      .subscribe((response) => {
      
          this.authService.setToken(response.token);
          this.authService.setRole(response.role);
          this.authService.logIn();
          this.authService.getUserList(this.name);
          this.router.navigate(["/movie-list"]);
      },
      (responseError) => {
          this.errorMsg = true;
      }); 
  }

}
