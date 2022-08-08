package org.example.mock;

import org.example.model.Student;

import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithMock {

@DisplayName(value="Test verify Add method with mock")
@Test
void testAddWithMock() {

StudentServiceMock mock = new StudentServiceMock();

StudentService service = new StudentService(mock);

Student jhanu = new Student(301,"Jhanu");

Student preethi = new Student(301,"Preethi");

service.add(jhanu);
//service.add(preethi);

mock.verify(jhanu,1);
//mock.verify(preethi,2);
}

}