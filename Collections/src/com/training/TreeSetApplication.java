package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		Student ram=new Student(101,"ram",78);
		Student shyam=new Student(102,"shyam",98);
		Student aaa=new Student(103,"aaa",88);
		
		Student ammm=new Student(103,"aaa",88);
		
		Set<Student> set=new TreeSet<>();
		set.add(ammm);
		set.add(aaa);
		set.add(shyam);
		set.add(ram);
		
		for(Student eachStudent:set) {
			System.out.println(eachStudent.getFirstName());
		}
	}

}
