package com.training.model;

import com.training.ifaces.Conditional;

public class Student implements Conditional {
	private double marksScored;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(double marksScored) {
		super();
		this.marksScored = marksScored;
	}


	public double isMarksScored() {
		return marksScored;
	}


	public void setMarksScored(double marksScored) {
		this.marksScored = marksScored;
	}


	@Override
	public boolean test(Object value) {
		String strBranch=(String)value;
		boolean result=false;
		if(this.marksScored > 80 && strBranch.equalsIgnoreCase("ece"));{
			result=true;
		}
		return result;
	}

}
