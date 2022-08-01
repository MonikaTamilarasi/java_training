package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Donar;
import com.example.demo.services.DonarServices;

@RestController
@RequestMapping(path = "/api/v1/donars")
@CrossOrigin(origins = "*")
public class DonarController {
	
	@Autowired
	private DonarServices service;
	
	@PostMapping
	public Donar add(@RequestBody Donar entity) {
	return this.service.save(entity);
	}
	@GetMapping
	public List<Donar> findAll(){
	return this.service.findAll();
	}
	
	@GetMapping(path="/srch/{name}")
	public Donar[] findByBloodGroup(@PathVariable("name") String name) {
		return this.service.findByBloodGroup(name);
	}
	
	@GetMapping(path="/srch/loc/{place}")
	public Donar[] findByLocation(@PathVariable("place") String name) {
		return this.service.findByLocation(name);
	}
	
	@PutMapping(path="/update/{mobile}/{location}")
	public ResponseEntity<Object>updateLocation (@PathVariable("mobile")long mobileNo,
			@PathVariable("location")String updateLocation){

	int rowUpdated=this.service.updateLocation(mobileNo, updateLocation);
	if(rowUpdated!=0) {
	return ResponseEntity.status(200).body(rowUpdated+ " updated");
	
	}else {

	return ResponseEntity.ok("not updated");

	}
	}
}
