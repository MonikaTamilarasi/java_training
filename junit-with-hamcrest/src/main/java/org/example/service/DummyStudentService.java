package org.example.service;

import java.util.List;

import org.example.ifaces.ProfessorRepository;
import org.example.interfaces.StudentRepository;
import org.example.model.Student;

public class DummyStudentService {
	
	private StudentRepository studRepo;
	private ProfessorRepository profRepo;
	public DummyStudentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DummyStudentService(StudentRepository studRepo, ProfessorRepository profRepo) {
		super();
		this.studRepo = studRepo;
		this.profRepo = profRepo;
	}
	
	public Student add(Student entity) {
		
		return this.studRepo.add(entity);
	}
	
	public List<Student> findAll(){
		return this.studRepo.findAll();
	}

	
}
