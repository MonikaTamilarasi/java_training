package com.training.model;

public class Book {
	private String bookName;
	private int noOfPages;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int noOfPages) {
		super();
		this.bookName = bookName;
		this.noOfPages = noOfPages;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", noOfPages=" + noOfPages + "]";
	}
	
}
