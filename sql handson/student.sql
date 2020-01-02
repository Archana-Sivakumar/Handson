create database studentdb;
use studentdb;

create table student 
(
st_id integer(10) primary key,
st_name varchar(10),
st_age integer(10),
st_state varchar(10)
);

delete from student;
insert into student 
values(1,'Archana',21,'TamilNadu'),
(2,'Divya',25,'Andhra'),
(3,'Sangi',22,'Delhi');

select st_id, st_name, st_age,st_state from student;