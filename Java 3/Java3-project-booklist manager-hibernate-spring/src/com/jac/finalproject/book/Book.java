package com.jac.finalproject.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int id;

	@Column(name = "book_name")
	private String name;

	@Column(name = "author")
	private String author;

	@Column(name = "publisher")
	private String publisher;

	@Column(name = "publish_date")
	private String date;

	// constructors
	public Book() {

	}

	public Book(String name, String author, String publisher, String date) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
	}

	// getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	// toString method
	@Override
	public String toString() {
		return "Book [id=" + id + ", book name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", publish date=" + date + "]";
	}

}
