package org.example.stub;

import java.util.Arrays;
import java.util.List;

import org.example.interfaces.StudentRepository;
import org.example.model.Student;

public class StudentRepositoryStub implements StudentRepository {

	@Override
	public Student add(Student entity) {
		return null;
	}

	@Override
	public List<Student> findAll() {
		
		//stub...
		return Arrays.asList(new Student(202, "Shiv"),new Student(203, "kasi"));
	}

}
