package com.training;

import com.training.exception.RangeCheckException;
import java.util.*;
import com.training.model.Student;
import com.training.services.StudentService;

public class Application {
	public static void main(String[] args) throws Exception {
		Student ram = null;
		try {
			ram = new Student(1010,"Ramesh",98);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StudentService service=new StudentService(ram);
		System.out.println(service.sendDetails());
		
		StudentService service2=new StudentService(ram);
		try {
			System.out.println("Grade : "+service2.findRank());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e:printStackTrace();
			//System.out.println("Name is Not Passed");
		}
	
		ExceptionHandling exHandling=new ExceptionHandling();
		exHandling.usingArrayIndexException(args);
		exHandling.usingNumberFormatException("Fourty five");
		System.out.println(exHandling.underStandFinallyBlock());
		
		//try with resource - scanner will be closed 
		try(Scanner scan=new Scanner(System.in)){
			System.out.println("Enter Number");
			int num=scan.nextInt();
			System.out.println(num);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
