package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		//public method able to access
		ram.setRollNo(101);
		//protected method cannot be accessed because application is not a subclass of a student
		//ram.setMarkScored(50);
		//default method cannot be accessed because different packages occurs
		//ram.setFirstName("Ram");
		//unable to access because the method is private
		//ram.setBranch("BE");
		System.out.println("Roll number="+ram.getRollNo());
		System.out.println("Mark scored="+ram.getMarkScored());
		System.out.println("Name="+ram.getFirstName());
		
		Student shyam = new Student(45,"shyam",87,"BE");
		System.out.println("Roll Number="+shyam.getRollNo());
		
		Student magesh = new Student(11,"mahesh","BE");
		System.out.println("Marks="+magesh.getMarkScored());
		

	}

}
