package com.example.demo.controllers;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;

@RestController
@RequestMapping(path="/api/v1")
public class DriverController {
	
	private DriverService service;
	
	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path="/drivers")
	public List<Driver> getAllDrivers(){
		return this.service.findAll();
		
	}
	
	@PostMapping(path="/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
		Driver driver=this.service.add(entity);
		
		URI loation=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(entity.getDriverId()).toUri();
		return ResponseEntity.created(loation).body(driver);
	}
	
	@GetMapping(path="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id") int id){
		return this.service.findById(id);
	}
	
	@DeleteMapping(path = "drivers")

	public ResponseEntity<Object> remove(@RequestBody Driver entity) {

	Driver result = this.service.remove(entity);
	if(result!=null) {
		return ResponseEntity.status(204).build();
	}else {

		return ResponseEntity.ok("No record matching");

	}
	}	
	
	@GetMapping(path="/drivers/srch/drivername/{driverName}")
	public List<Driver> findByDriverName(@PathVariable("driverName")String srchName){
	return this.service.findByDriverName(srchName);

	}
	@GetMapping(path="/drivers/srch/mobileno/{mobileNumber}")
	public List<Driver> getByDriverMobileNumber(@PathVariable("mobileNumber")long number) {
		return this.service.srchByMobileNumber(number);
	}
	
	@GetMapping(path="/drivers/srch/rating/{rating}")
	public 	List<Driver> srchByRating(@PathVariable("rating")double rating){
		return this.service.srchByDriverRating(rating);
		
	}
	
	@PutMapping(path="/drivers/{id}/{rating}")
	public ResponseEntity<Integer> updateRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating) {
		int update=this.service.updateRating(id, updatedRating);
		return ResponseEntity.ok().body(update);
	}
	
	@GetMapping(path="/drivers/sort/{propName}")
	public List<Driver> sorted(@PathVariable("propName")String propName){
		return this.service.sortedList(propName);
		
	}

		
	

	
}
