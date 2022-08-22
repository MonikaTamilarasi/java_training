package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Sorting;

public class Application {
	public static void main(String[] args) {
		ArrayList <String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("pineapple");
		fruits.add("orange");
		fruits.add("banana");
		
		Collections.sort(fruits);
		Set<String> set =new TreeSet<>();
		set.addAll(fruits);
		System.out.println(set);
		
	}

}

