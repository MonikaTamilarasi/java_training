package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.interfaces.ProductRepository;
import org.example.model.Product;

public class ProductService {
	
	private ArrayList<Product> productList;
		
	public ProductService(ArrayList<Product> productList) {
		super();
		this.productList = new ArrayList<>();	
	}
	
	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	private ProductRepository repo;

	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Product add(Product entity) {
		
		return this.repo.add(entity);
	}
	
	public List<Product> findAll(){
		return this.repo.findAll();
	}
	
	public Product findbyId(int key) {

		Product found =  this.repo.findById(key).get();
		found.setId(778);
		return found;
	}
}
