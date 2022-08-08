package org.example.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.fake.StudentRepoFake;
import org.example.model.Student;
import org.example.service.DummyStudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithDummy {

	@Test
	@DisplayName("Test Add Method Return inserted object back")
	void testAddMethod() {
		StudentRepoFake fake = new StudentRepoFake();
		
		DummyProfessorrepository dummy = new DummyProfessorrepository();
		DummyStudentService service = new DummyStudentService(fake, dummy);

		Student ram = new Student(101, "ram");

		Student actual = service.add(ram);
		
		assertEquals(actual, ram);
	}
}
