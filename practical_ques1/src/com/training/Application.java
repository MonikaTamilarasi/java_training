package com.training;

import com.training.model.Permutations;

public class Application {

		public static void main(String[] args) {
			Permutations str=new Permutations();
			System.out.println(str.getString());
			
			System.out.println(str.stringPermutations(str));
		}
}
