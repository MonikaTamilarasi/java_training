package com.training.services;

import java.util.List;
import java.util.ArrayList;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookServices implements CrudRepository {
	private ArrayList<Book> bookList;
	
	public BookServices() {
		super();
		// TODO Auto-generated constructor stub
		this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		Book found=null;
		for(Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
				found=eachBook;
		}
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		
		return bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldbook,Book newBook) {
		if(this.bookList.contains(oldbook)){
			//System.out.println("Inside IF block'''''''''''");
			
			int idxPos=this.bookList.indexOf(oldbook);
			this.bookList.set(idxPos, newBook);
		}
		return newBook;
	}

	

}
