package org.example.mockito.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.example.interfaces.StudentRepository;
import org.example.model.Student;
import org.example.services.StudentService;

public class StudentServiceTest {
	
	@DisplayName("Test Find All Method with Mockito Stub")
	@Test
	void testFindAll() {
		
		StudentRepository repo = Mockito.mock(StudentRepository.class);
		
		StudentService service = new StudentService(repo);
		
		Student stud1 = new Student(101, "Moni");
		Student stud2 = new Student(102, "Angel");

		
		List<Student> list = new ArrayList<>();
		
		list.add(stud1);
		list.add(stud2);
		
		//stubbing
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(2,service.findStudentSize());
	}
	
	
	
}
