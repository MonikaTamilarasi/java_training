package org.example.mockito.module1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.example.interfaces.StudentRepository;
import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class StudentServiceTestWithAnnotations {
			
		@Mock
		StudentRepository repo ;
		
		@Mock
		StudentService serviceMock ;

		@InjectMocks
		StudentService service ;
				
		@DisplayName("Test Find All Method with Mockito Stub and Annotations")
		@Test
		
		void testFindAll() {
					
			Student stud1 = new Student(101, "Moni");
			Student stud2 = new Student(102, "Angel");
			
			List<Student> list = new ArrayList<>();
			
			list.add(stud1);
			list.add(stud2);
			
			when(repo.findAll()).thenReturn(list);
			
			assertEquals(2,service.findStudentSize());	
			
	}
		@Test
		@DisplayName(value = "Test addWithCondition Method of the servcie it should add elements"
				+ "of roll number is greater than 2000 else it should return a null value")
		
		void testAddWithCondition() {
			
			Student stud1 = new Student(2003, "Moni");
//			Student stud2 = new Student(102, "Angel");				
			assertNotNull(service.addWithCondition(stud1));
			
		}
		
		@Test
		void testVerifyAddWithCondition() {
			Student stud =  new Student(2020, "Moni");
			serviceMock.addWithCondition(stud);
			verify(serviceMock,times(1)).addWithCondition(stud);
		}
}
