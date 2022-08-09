package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
	
	private ProductRepository repo;
	
	public Product add(Product entity) {
		return this.repo.save(entity);
	}
	
	public List<Product> findAll(){
		return this.repo.findAll();
	}
}
