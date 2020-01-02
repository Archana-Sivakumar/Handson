-- Include table data insertion, updation, deletion and select scripts

insert into `movie_cruiser`.`movie_list` 
    values(1, 'Avatar', 2787965087, 'Yes', '2017-03-15', 'Science Fiction', 'Yes',''),
    (2, 'The Avengers', 1518812988, 'Yes', '2017-12-23', 'Superhero', 'No',''),
    (3, 'Titanic', 2187463944, 'Yes', '2017-08-21', 'Romance', 'No',''),
    (4, 'Jurassic World', 1671713208, 'No', '2017-07-02', 'Science Fiction', 'Yes',''),
    (5, 'Avengers:End Game', 2750760348, 'Yes', '2022-11-02', 'Superhero', 'Yes','');
    
select mo_title, mo_box_office, mo_active, mo_date_of_launch, mo_genre, mo_has_teaser 
    from `movie_cruiser`.`movie_list`; 
    
select mo_title, mo_box_office, mo_active, mo_date_of_launch, mo_genre, mo_has_teaser 
    from `movie_cruiser`.`movie_list` 
    where mo_date_of_launch = NOW() 
    or mo_date_of_launch < NOW() 
    and mo_active = 'Yes';


select mo_title, mo_box_office, mo_active, mo_date_of_launch, mo_genre, mo_has_teaser 
    from `movie_cruiser`.`movie_list` 
    where mo_id = 1;
    
update `movie_cruiser`.`movie_list` 
    set mo_title = 'Fast & Furious', mo_box_office = 2787965087, mo_active = 'Yes', mo_date_of_launch = '2017-03-15', mo_genre = 'Science Fiction', mo_has_teaser = 'Yes' 
    where mo_id = 1;


insert into  `movie_cruiser`.`user` 
     values (1, 'user','user','user','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK');

insert into  `movie_cruiser`.`user` 
     values (2, 'admin','admin','admin','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK');

select * from `movie_cruiser`.`user`;

insert into `movie_cruiser`.`role` values (1, 'USER');

insert into `movie_cruiser`.`role` values (2, 'ADMIN');

select * from `movie_cruiser`.`role`;

insert into `movie_cruiser`.`user_role` values (1, 1, 1);

insert into `movie_cruiser`.`user_role` values (2, 2, 2);

select * from `movie_cruiser`.`user_role`;
    
insert into `movie_cruiser`.`favorites`
    values(1, 1, 1), (2, 1, 2), (3, 1, 3);

select * from `movie_cruiser`.`favorites`;

select mo_title, mo_box_office, mo_active, mo_date_of_launch, mo_genre, mo_has_teaser 
    from `movie_cruiser`.`favorites`
    inner join `movie_cruiser`.`movie_list` 
    on fs_mo_id = mo_id 
    where fs_us_id = 1;
    
select count(fs_mo_id) as No_Of_Favorites 
    from `movie_cruiser`.`favorites` 
    where fs_us_id = 1;


delete from `movie_cruiser`.`favorites` 
    where fs_us_id = 1 
    and fs_mo_id = 1;
    
    
