package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CreditCard;
import com.example.demo.repo.CreditCardRepository;

@Service
public class CreditCardService {
	
	private CreditCardRepository repo;
	
	@Autowired
	public CreditCardService(CreditCardRepository repo) {
		super();
		this.repo = repo;
	}
	
	@Cacheable("cards")
	public List<CreditCard> getAll(){
		System.out.println("findall");
		return this.repo.findAll();
	}
	
	@Cacheable(value  = "card",key="#cardNumber")
	public CreditCard getById(long cardNumber) {
		System.out.println("find by id");
		return this.repo.findById(cardNumber).orElseThrow(() -> 
		new RuntimeException("Not Found"));
	}
	
	@CachePut(value  = "cards",key="#entity.cardNumber")
	public CreditCard addCard(CreditCard entity) {
		System.out.println("addd");
		return this.repo.save(entity);
	}
	
	@CacheEvict(value = "cards",key = "#entity.cardNumber")
	public void rermove (CreditCard entity) {
		this.repo.deleteById(entity.getCardNumber());
	}
}
