package com.training;
import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookServices;
import com.training.utils.BookNameComparator;
public class App {
	public static void print(List<Book> books) {
		for(Book eachBook:books) {
			System.out.println(eachBook);
		}
		
		
	}

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
			names.add("Anand");

			names.add("Ramesh");
			names.add("Chandru");
			names.add("Zahir");
			names.add("Pavan");
			System.out.println(names);
			
			Collections.sort(names);
			System.out.println(names);
			
			Book java=new Book(101,"java","suba",450);
			Book spring=new Book(102,"spring","Mad",650);
			Book maven=new Book(103,"Maven","Harish",550);
			Book html=new Book(104,"Html","priya",1450);
			Book python=new Book(105,"python","Sathya",850);
			
			CrudRepository service=new BookServices();
			
			System.out.println(service.add(java));
			System.out.println(service.add(spring));
			System.out.println(service.add(maven));
			System.out.println(service.add(html));
			System.out.println(service.add(python));
			
			List<Book> bookList=service.findAll();
			
			Collections.sort(bookList);
			
			print(bookList);
			
			Collections.sort(bookList,new BookNameComparator());
			System.out.println("=====sort by book names=====");
			print(bookList);
			
	}

}
