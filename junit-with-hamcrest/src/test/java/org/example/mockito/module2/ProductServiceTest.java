package org.example.mockito.module2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.example.interfaces.ProductRepository;
import org.example.model.Product;
import org.example.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)

public class ProductServiceTest {
	
	@Mock
	ProductRepository repo;
	
	@InjectMocks
	ProductService service;
	
	@DisplayName("Test get by id Method should returns list of products"
			+ "id the id is present")
	@Test
	
	void testGetById() {
		
		Product prod =  new Product(101, "Laptop", 5750);
		Product prod1 =  new Product(102, "fridge", 55750);
		
		when(repo.findById(101)).thenReturn(Optional.of(prod));
		
		Product expected = service.findbyId(101);
		assertEquals(expected, prod);
		
	}
	
	@Test
	public void shouldThrowExceptionWhenElementNotFound() {
		
		when(repo.findById(anyInt())).thenThrow(RuntimeException.class);
		assertThrows(RuntimeException.class, () -> service.findbyId(64));
	}
	
	
}
