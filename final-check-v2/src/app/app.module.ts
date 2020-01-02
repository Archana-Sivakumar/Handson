import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovieListComponent } from './movies/movie-list/movie-list.component';
import { MovieComponent } from './movies/movie/movie.component';
import { MovieSearchComponent } from './movies/movie-search/movie-search.component';
import { MovieEditComponent } from './movies/movie-edit/movie-edit.component';
import { FavoriteComponent } from './favorites/favorite/favorite.component';
import { LoginComponent } from './site/login/login.component';
import { SignupComponent } from './site/signup/signup.component';
import { HeaderComponent } from './header/header.component';
import { SeatComponent } from './seat/seat.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    MovieComponent,
    MovieSearchComponent,
    MovieEditComponent,
    FavoriteComponent,
    LoginComponent,
    SignupComponent,
    HeaderComponent,
    SeatComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
