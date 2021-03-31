## create database
CREATE DATABASE IF NOT EXISTS book_tracker;
USE book_tracker;

## create table
DROP TABLE IF EXISTS book;
CREATE TABLE book
(
	book_id int primary key auto_increment,
    book_name varchar(255) default null,
    author varchar(45) default null,
    publisher varchar(80) default null,
    publish_date date default null
);

DESCRIBE book;
truncate book;
insert into book
(book_name, author, publisher, publish_date)
values
("The Deep End", "Jeff Kinney", "Harry N. Abrams", "20201027"),
("Extraordinary Canadians", "Peter Mansbridge", "Simon & Schuster", "20201110"),
("Anxious People", "Fredrik Backman", "Atria Books", "20200908"),
("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "Arthur A. Levine Books", "20151006");
SELECT * FROM book;
