package com.example.model;

public class Student {
	private int rollNo;
	private String firstName;
	private double markScored;
	private String branch;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int rollNo, String firstName, String branch) {
		//this(rollNo,firstName,99,branch);
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.branch = branch;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}


	public Student(int rollNo, String firstName, double markScored, String branch) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.markScored = markScored;
		this.branch = branch;
	}


	public String getBranch() {
		return branch;
	}
	private void setBranch(String branch) {
		this.branch = branch;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	protected void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	
}
