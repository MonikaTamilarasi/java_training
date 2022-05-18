package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.ifaces.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repo;
	
	//find all from repository interface
	public void task1() {
		List<Address> addressList=repo.findAll();
		for(Address eachAddress:addressList) {
			System.out.println(eachAddress.getTitle());
			System.out.println(eachAddress.getCity());
			System.out.println(eachAddress.getUser());
		}
	}
	
	//find all using entity graph (finding both user and city)  ,fetch type=load because it
	//is eager type, get both user and city
	public void task2() {
		List<Address> addressList=repo.findAll();
		for(Address eachAddress:addressList) {
			System.out.println(eachAddress.getTitle());
			System.out.println(eachAddress.getCity());
			System.out.println(eachAddress.getUser());
		}
	}

	//finding only user details using entity graph by making type=fetch,because fetch is lazy type
	//only finds user
	public void task4() {
		List<Address> addressList=repo.findAll();
		for(Address eachAddress:addressList) {
			System.out.println(eachAddress.getTitle());
			System.out.println(eachAddress.getUser());
		}
	}

}
