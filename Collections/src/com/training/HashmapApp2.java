package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashmapApp2 {

	public static void main(String[] args) {
		Student ram=new Student(101,"ram",78);
		Student shyam=new Student(102,"shyam",98);
		Student aaa=new Student(103,"aaa",88);
		
		HashMap<Integer, Student> map=new HashMap<>();
		map.put(900, ram);
		map.put(902, shyam);
		map.put(904, aaa);
		
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		for(Integer key:keys) {
			System.out.println(map.get(key));
		}
		Collection<Student> list=map.values();
		for(Student eachStudent:list) {
			System.out.println(eachStudent);
			
		}
		Set<Map.Entry<Integer,Student>> list2=map.entrySet();
		for(Map.Entry<Integer, Student> eachEntry:list2) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
	}
	
		

}
