package com.training;
import java.util.*;
import java.util.stream.*;

import com.training.model.Book;

import static java.util.stream.Collectors.*;



public class UsingStreams {
	public static void useDinstinct(List<Book> bookList) {
		bookList.stream().distinct().forEach(System.out::println);
	}
	
	public static void collectToSet(List<Book> bookList) {
		
		Set<Book> values=bookList.stream().filter(e -> e.getPrice()>500).collect(toSet());
		bookList.forEach(System.out::println);
	}
	
	public static void collectToMap(List<Book> bookList) {
		//Set<Book>bookSet=bookList.stream().collect(toSet());
		Map<String,Double> values=bookList.stream().filter(e->e.getPrice()>500).distinct().collect(toMap(Book::getBookName,Book::getPrice));
		values.forEach((key,value)->System.out.println(key+","+value));
	}
	
	public static void findMaxPrice(List<Book> bookList) {
		Optional<Book> optional=bookList.stream().max(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("Maximum Price : ="+optional.get().getPrice());
		}
				}
	
	
	public static void findMinPrice(List<Book> bookList) {
		Optional<Book> optional2=bookList.stream().min(Comparator.comparing(Book::getPrice));
		if(optional2.isPresent()) {
			System.out.println("Minimum Price :"+optional2.get().getPrice());
		}
	}
	
	
	public static void countBookNameContainsV(List<Book> bookList) {
		long values=bookList.stream().filter(e->e.getBookName().contains("v")).count();
		System.out.println("count:"+values);
	}
	
	
	public static void main(String[] args) {
		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","Mad",650);
		Book maven=new Book(103,"Maven","Harish",550);
		Book html=new Book(104,"Html","priya",1450);
		Book python=new Book(105,"python","Sathya",850);
		Book mavenNew=new Book(103,"Maven","Harish",550);
		Book htmlNew=new Book(104,"Html","priya",1450);
		
		List<Book> bookList=Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
		
		int key=6;
		switch (key) {
		case 1:
			useDinstinct(bookList);
			break;
		case 2:
			
			collectToSet(bookList);
			break;
		case 3:
			
			collectToMap(bookList);
			break;
		case 4:
			
			collectToMap(bookList);
			break;	
		case 5:
	
			findMinPrice(bookList);
			break;
		case 6:
			countBookNameContainsV(bookList);
			break;
		default:
			break;
		}
		

	}

}
