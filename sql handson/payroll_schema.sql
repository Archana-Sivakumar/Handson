create database payroll;
use payroll;

create table employee
 (
employee_id int auto_increment,
name varchar(255),
date_of_birth date,
salary int,
primary key(employee_id)
);
select * from employee;
delete from employee;