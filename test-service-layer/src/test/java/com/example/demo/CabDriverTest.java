package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static  org.hamcrest.Matchers.hasSize;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(Lifecycle.PER_CLASS)

public class CabDriverTest {
	
	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	CabDriverService service;
	
	private CabDriver canna;
	private CabDriver damu;
	private CabDriver david;

	@BeforeAll
	void init() {
		 canna = new CabDriver(2020, "canna", 64574385, "Chennai", LocalDate.of(1998, 06, 15), 4.5);
		 damu = new CabDriver(2021, "damu", 784574385, "Chennai", LocalDate.of(1999, 4, 18), 4.5);
		 david = new CabDriver(2022, "david", 5645646, "Trichy", LocalDate.of(1997, 06, 17), 3.5);

	}
	@DisplayName("Test find All Mehtod return an array")
	@Test
	void testFindAll() throws Exception{
		
		List<CabDriver> list = new ArrayList<>();
		list.add(canna);
		list.add(damu);
		list.add(david);
		
		given(service.findAll()).willReturn(list);
		mock.perform(MockMvcRequestBuilders
				.get("/api/v1/drivers")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[2].driverName", is("david")));
	}
	
	@Test
	@DisplayName("Test Add Method return status code 201 and returns the element added")
	void testAdd() throws Exception{
		
		CabDriver  dravid = new CabDriver(2030, "dravid", 756765645, "Palani", LocalDate.of(1991, 05, 07), 5);
		
		given(service.save(dravid)).willReturn(dravid);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers").
				contentType(MediaType.APPLICATION_JSON).
				content(asJsonString(dravid)))
				.andExpect(status().isCreated())
					.andExpect(content()
						.contentType(MediaType.APPLICATION_JSON))
						.andExpect(jsonPath("$.driverName", is("dravid")));
				
	}
	private static String asJsonString(CabDriver obj) {


		try {
		ObjectMapper objectMapper = new ObjectMapper();

		return objectMapper.writeValueAsString(obj);

		} catch (Exception e) {

		throw new RuntimeException(e);

		}
	
	}
	@DisplayName("Test find by id Mehtod return an element if present")
	@Test
	void testFindById() throws Exception{
		
		 CabDriver canna = new CabDriver(2020, "canna", 64574385, "Chennai", LocalDate.of(1998, 06, 15), 4.5);

		given(service.findById(2020)).willReturn(Optional.of(canna));
		mock.perform(MockMvcRequestBuilders
				.get("/api/v1/drivers/2020")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
//				.andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$.driverName", is("canna")));
	}
	
	@DisplayName("Test deleteById Method return a deletedelement")
	@Test
	void testDeleteById() throws Exception {

	Optional<CabDriver> element=Optional.of(canna);

	given(service.remove(2020)).willReturn(element);

	mock.perform(MockMvcRequestBuilders
	.delete("/api/v1/drivers/del/2020")
	.contentType(MediaType.APPLICATION_JSON))
	// .andExpect(status(204))
	// .andExpect(jsonPath("$", hasSize(3)))
	.andExpect(jsonPath("$.driverName", is("canna")));

	}

	
	
	
	
	
}
