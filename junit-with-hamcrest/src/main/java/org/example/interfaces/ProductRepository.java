package org.example.interfaces;

import java.util.List;
import java.util.Optional;

import org.example.model.Product;

public interface ProductRepository {
	
	public Product add(Product entity);
	public List<Product> findAll();
	public Optional<Product> findById(int id);
	public Product deleteById(int id);
	
}
