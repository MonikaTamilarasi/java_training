package com.example;
import java.time.*;
public class Student {
	private int rollNumber;
	private String studentName;
	private LocalDate dateOfBirth;
	private LocalDateTime dateOfjoining;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, LocalDate dateOfBirth, LocalDateTime dateOfjoining) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfjoining = dateOfjoining;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDateTime getDateOfjoining() {
		return dateOfjoining;
	}
	public void setDateOfjoining(LocalDateTime dateOfjoining) {
		this.dateOfjoining = dateOfjoining;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfjoining=" + dateOfjoining + "]";
	}
	
	
}
