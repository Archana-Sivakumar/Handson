import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient:HttpClient) { 
    }

    addUserList(signupForm) {
      return this.httpClient.post(environment.signupUrl+"/sign-up",signupForm);
    }
    
}
