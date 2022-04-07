package com.exercise2;

public class Employee {

	private String name;
	private int idNo;
	private double sal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int idNo, double sal) {
		super();
		this.name = name;
		this.idNo = idNo;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	

	}


