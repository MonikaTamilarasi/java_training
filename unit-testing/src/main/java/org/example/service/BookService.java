package org.example.service;

import java.util.*;

import org.example.model.Book;

/**
 * 
 * @author Monikatamilarasi.N
 *	Class BookService
 */
public class BookService {
	 
	private Set<Book> bookList;
	
	/**
	 * Constructor bookService
	 */
	public BookService() {
		super();
		this.bookList=new HashSet();
	}
	
	public Set<Book> getBookList(){
		return this.bookList;
	}
	
	/**
	 * 
	 * @param book
	 * @return
	 */
	public int addBook(Book book){
		return this.bookList.add(book)?1:0;
	}
	
	/**
	 * 
	 * @param book
	 * @return
	 */
	public boolean removeBook(Book book) {
		boolean result;
		if(this.bookList.contains(book)) {
			this.bookList.remove(book);
			result=true;
		}else {
			throw new NullPointerException("Element Not Found");
		}
		return result;
	}
	
	public List<String> getBestBooks(){
		List<String> list = Arrays.asList("FaceBook","PassBook","CookBook");
		return list;
	}
}
