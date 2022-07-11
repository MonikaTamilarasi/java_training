package com.training.services;

import java.util.List;
import static java.util.stream.Collectors.*;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;
import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookServices implements CrudRepository {
	private ArrayList<Book> bookList;
	
	public BookServices() {
		super();
		//TODO Auto-generated constructor stub
		this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		//TODO Auto-generated method stub
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
	
	//stream - filter
	public List<Book> findBookGrtThan(double price){
		return this.bookList.stream().filter(e -> e.getPrice()>price).collect(toList());
		//return bookList;
		
	}
	
	//getting book names using map method
	public List<String> getBookNames(){
		return this.bookList.stream().map(e -> e.getBookName()).collect(toList());
	}
	
	
	public List<String> getBookNameGrtThanPrice(double price){
		return this.bookList.stream().filter(e->e.getPrice()>price).
				map(e->e.getBookName()).collect(toList());
	}
	
	//comparing
	public List<Book> sortedByName( ){
		return this.bookList.stream().sorted(Comparator.comparing(Book::getBookName)).
				collect(toList());
	}
	
	public List<Book> sortedByNumberDesc(){
		return this.bookList.stream().sorted(Comparator.reverseOrder()).collect(toList());
	}
	
	
	
public List<Book> getBooksGrtThan(double price){
		
		//write using predicate and foreach
		List<Book> grtThanList=new ArrayList<>();
		
		Predicate<Double> grtThan=(value)->value>800.00;
		
		
		this.bookList.forEach(book->
		{
			double bookPrice=book.getPrice();
			if(grtThan.test(bookPrice)) {
				System.out.println(book);
				grtThanList.add(book);
				
			}
		});
		return grtThanList ;
}
}
