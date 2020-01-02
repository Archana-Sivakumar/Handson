import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MovieListComponent } from './movies/movie-list/movie-list.component';
import { MovieEditComponent } from './movies/movie-edit/movie-edit.component';
import { FavoriteComponent } from './favorites/favorite/favorite.component';
import { SignupComponent } from './site/signup/signup.component';
import { LoginComponent } from './site/login/login.component';
import { AuthGuard } from './site/auth.guard';
import { SeatComponent } from './seat/seat.component';

const routes: Routes = [
  {path: "", component: MovieListComponent},
  {path: "movie-list", component: MovieListComponent},
  {path: "edit-movie/:movieId", component: MovieEditComponent,canActivate:[AuthGuard]},
  {path: "favorite-movie", component: FavoriteComponent,canActivate:[AuthGuard]},
  {path: "signup", component: SignupComponent},
  {path: "login", component: LoginComponent},
  {path: "seat/:movieId", component: SeatComponent,canActivate:[AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
