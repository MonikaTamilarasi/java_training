package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	public List<Employee> findByDateOfBirth(LocalDate date);
	
	public List<Employee> findByLocation(String srch);
	
	public List<Employee> findBySkillSet(String skill);
	
	@Query(nativeQuery=true,
			value="select * from moni_employee where skill_set=:skillSet and location=:loc")
	public List<Employee> findBySillSetAndLocation(@Param("skillSet")String skillSet,
			@Param("loc")String loc);
	
	public List<Employee> findBySkillSetOrLocation(String skill,String loc);
	
}
