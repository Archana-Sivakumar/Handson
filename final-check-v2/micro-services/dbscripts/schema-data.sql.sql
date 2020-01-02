-- Include table data insertion, updation, deletion and select scripts
use movie_cruiser;
insert into `movie_cruiser`.`movie_list` 
    values(1, 'Avatar', 2787965087, 'Yes', '2017-03-15', 'Science Fiction', 'Yes','https://upload.wikimedia.org/wikipedia/en/thumb/b/b0/Avatar-Teaser-Poster.jpg/220px-Avatar-Teaser-Poster.jpg'),
    (2, 'The Avengers', 1518812988, 'Yes', '2017-12-23', 'Superhero', 'No','https://upload.wikimedia.org/wikipedia/en/f/f9/TheAvengers2012Poster.jpg'),
    (3, 'Titanic', 2187463944, 'Yes', '2017-08-21', 'Romance', 'No','https://upload.wikimedia.org/wikipedia/en/1/19/Titanic_%28Official_Film_Poster%29.png'),
    (4, 'Jurassic World', 1671713208, 'No', '2017-07-02', 'Science Fiction', 'Yes','https://timesofindia.indiatimes.com/thumb/61961726.cms?width=219&height=317&imgsize=97214'),
    (5, 'Avengers:End Game', 2750760348, 'Yes', '2022-11-02', 'Superhero', 'Yes','https://upload.wikimedia.org/wikipedia/en/0/0d/Avengers_Endgame_poster.jpg');


insert into  `movie_cruiser`.`user` 
     values (1, 'user','user','user','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK');

insert into  `movie_cruiser`.`user` 
     values (2, 'admin','admin','admin','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK');

insert into `movie_cruiser`.`role` values (1, 'USER');

insert into `movie_cruiser`.`role` values (2, 'ADMIN');

insert into `movie_cruiser`.`user_role` values (1, 1, 1);

insert into `movie_cruiser`.`user_role` values (2, 2, 2);
    
insert into `movie_cruiser`.`favorites`
    values(1, 1, 1), (2, 1, 2), (3, 1, 3);

    
    
