package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class TestServiceLayerApplicationTests {
	
	@Autowired
	CabDriverService service;
	
	@BeforeAll
	void setUp() {
		CabDriver driver =  new CabDriver(501, "Jhanu", 733456789, "Vellore", LocalDate.of(2000, 8, 30), 4.7);
		driver.setDriverName("Amali");
		service.save(driver);
	}

	@Test
	@DisplayName("Find All Method should return an Empty Array")
	void testFindAllISEmpty() {
		
		assertTrue(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("Find All Method should return an  Array with element")
	void testFindAllSuccess() {
		
		assertFalse(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("Find All Method should return an  element with given Id")
	void testFindById() {
		
		assertEquals("Amali",service.findById(501).get().getDriverName());
	}
	
	@Test
	@DisplayName("Find All Method should return an  element with given Id and throws exception"
			+ " if id is not found")
	void testFindByIdTwo() {
		
		CabDriver driver = service.findById(56).orElseThrow(EntityNotFoundException::new);
		
		assertEquals("Amali",driver.getDriverName());
	}
	
	
	
	

}
