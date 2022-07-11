package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Table(name = "moni_books1")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
	
	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "book_name")
	String bookName;
	
	@Column(name = "author")
	String authorName;
	
	@Column(name = "price")
	double price;
}
