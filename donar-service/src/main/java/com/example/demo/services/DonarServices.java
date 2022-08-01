package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donar;
import com.example.demo.ifaces.DonarRepository;

@Service
public class DonarServices {
	
	private DonarRepository repo ;
	
	@Autowired
	public DonarServices(DonarRepository repo) {
		super();
		this.repo = repo;
	}
		
	
	
	public Donar save(Donar entity) {
		return repo.save(entity);
	}
	
	public List<Donar> findAll(){
		return (List<Donar>) repo.findAll();
	}
	
	public Donar[] findByBloodGroup(String name) {
		return this.repo.findByBloodGroup(name);
	}
	
	public Donar[] findByLocation(String name) {
		return this.repo.findByLocation(name);

	}
	
	public int updateLocation(long mobileNo,String updateLocation){
		return this.repo.modifyLocation(mobileNo, updateLocation);


		}


}
