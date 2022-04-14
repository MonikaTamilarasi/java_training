package com.training;
import java.util.*;

import com.training.model.Student;

public class SetApplication {

	public static void main(String[] args) {

		Student ram=new Student(101,"ram",78);
		Student shyam=new Student(102,"Shyam",98);
		Student aaa=new Student(103,"aaa",88);
		
		Student ammm=new Student(103,"aaa",88);
		HashSet<Student> set=new HashSet<>();
		set.add(ammm);
		set.add(aaa);
		set.add(shyam);
		set.add(ram);
		System.out.println(set);
		System.out.println(set.size());
	}

}
