package com.training.model;

public class Permutations {
	private String string="cat";

	public Permutations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permutations(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public String stringPermutations(Permutations str1) {
		return str1.getString().replace("a", "t");
			
}
}