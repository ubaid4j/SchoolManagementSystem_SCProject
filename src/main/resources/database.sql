drop database if exists SMSSP;
create database SMSSP;
use SMSSP;
drop table if exists users;
create table users(
id bigint,
name varchar(255),
age int,
email varchar(255),
gender varchar(10),
password varchar(255));

drop table if exists teacher;
create table teacher(
userId bigint,
speciality varchar(255),
courses bigint);

drop table if exists student;
create table student(
userId bigint,
courses bigint);

drop table if exists admin_;
create table admin_(
userId bigint,
loginTime bigint);

insert into admin_ values(
