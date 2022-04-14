package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		Student ram=new Student(101,"ram",78);
		Student shyam=new Student(102,"shyam",98);
		Student aaa=new Student(103,"aaa",68);
		HashMap<Integer, Student> map=new HashMap<>();
		
		System.out.println(map.put(900, ram));
		System.out.println(map.put(902, shyam));
		//System.out.println(map.put(902, aaa));
		Student added=map.put(902, aaa);
	
		//System.out.println(map.get(902));
		
		if(added!=null) {
			map.put(904, added);
		}
		System.out.println(map.get(902));
		System.out.println(map.get(904));
	}

}
