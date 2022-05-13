package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServices {
	
	private EmployeeRepository repo;
	
	@Autowired
	public EmployeeServices(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Employee add(Employee entity) {
		return this.repo.save(entity);
	}
	
	public Iterable<Employee> findAll() {
		return this.repo.findAll();
	}
	
	public List<Employee> findByDateOfBirth(LocalDate date){
		return this.repo.findByDateOfBirth(date);
	}
	
	public List<Employee> findByLoc(String srch){
		return this.repo.findByLocation(srch);

	}
	
	public List<Employee> findSkillSet(String skill){
		return this.repo.findBySkillSet(skill);
	}
	
	public List<Employee> findBySillSetAndLocation(String skillSet,String loc){
		return this.repo.findBySillSetAndLocation(skillSet, loc);
	}
	
	public List<Employee> getBySkillSetOrLocation(String skill,String loc){
		return this.repo.findBySkillSetOrLocation(skill, loc);
	}


	}
