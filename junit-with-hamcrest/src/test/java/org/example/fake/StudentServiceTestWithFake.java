package org.example.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.interfaces.StudentRepository;
import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithFake {
	
	@Test
	@DisplayName("Test Add Method return inserted object back")
	void testAddMethod() {
		StudentRepoFake fake = new StudentRepoFake();
		
		StudentService service = new StudentService(fake);
		Student ram = new Student(101, "ram");
		
		Student actual = service.add(ram);
		
		assertEquals(actual, ram);
	}
	
	@Test
	@DisplayName(value = "Test findAll method return all the elements added")
	void testFindAllMethod() {
		StudentRepoFake fake = new StudentRepoFake();
		
		StudentService service = new StudentService(fake);
		Student ram = new Student(101, "ram");	
		Student shyam = new Student(102, "shyam");	
		service.add(ram);
		service.add(shyam);
		
//		int actual = service.findAll().size();
		int expected = 2;
		assertEquals(expected, service.findAll().size());

	}
	
}
