package com.task3;

import com.exercise2.Employee;

public class EmployeeService {
	
	public double calculateBonus(Employee object) {
		return (0.33)*object.getSal();
		
	}
}
