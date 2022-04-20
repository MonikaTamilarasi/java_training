package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Appplication {

	public static void main(String[] args) {
		
		Student ram=new Student(101, "ram", LocalDate.of(1972, 10, 12), 
				LocalDateTime.of(2000, Month.JUNE, 5, 9, 30));
		
		Student shyam=new Student(102, "Shyam", LocalDate.now(), LocalDateTime.now());
		
		System.out.println("Ram's Year Of Birth is : "+ram.getDateOfBirth().getYear());
		System.out.println("Ram;s First Birthday :"+ram.getDateOfBirth().plus(1, ChronoUnit.YEARS));
		
		System.out.println("Shyam's year of birth :"+shyam.getDateOfBirth().getYear());
		System.out.println("Shyams 50th Birthday :"+shyam.getDateOfBirth().plus(50, ChronoUnit.YEARS));
		System.out.println("Shyams Previous Bithday :"+ram.getDateOfBirth().minus(2, ChronoUnit.YEARS));
		
		System.out.println("Rams hr :"+ram.getDateOfjoining().getHour());
	
	}
}
