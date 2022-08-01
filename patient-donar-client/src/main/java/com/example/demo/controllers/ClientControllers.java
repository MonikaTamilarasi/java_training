package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.DonarDTO;
import com.example.demo.entity.Donar;
import com.example.demo.entity.Patient;

@RestController
@RequestMapping(path = "/client")
public class ClientControllers {

	@Autowired
	private DonarDTO dto;
	
	private RestTemplate template;
	
	
	@Autowired
	public ClientControllers(RestTemplate template) {
		super();
		this.template = template;
	}

	@GetMapping(path = "/patients")
	public String getPatients() {
		return this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients", String.class);
	}
	
	@GetMapping(path = "/patients/json")
	public Patient[] getPatientAsJson() {
		return this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients", Patient[].class);
	}
	
	@GetMapping(path = "/donars")
	public String getDonars() {
		return this.template.getForObject("http://DONAR-SERVICE/api/v1/donars", String.class);
	}
	
	@GetMapping(path = "/patient/donars/srch/{name}")
	public DonarDTO getPatientDonars(@PathVariable("name")String name) {

	Patient patient=this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/srch/"+name,Patient.class);

	Donar[] donars=this.template.getForObject("http://DONAR-SERVICE/api/v1/donars/srch/"+name,Donar[].class);

	dto.setPatients(patient);
	List<Donar> detailSet = Arrays.asList(donars);
	//List<Donar> detailSet = Arrays.stream(donars).collect(Collectors.toSet());
	dto.setDonars(detailSet);

	return dto;	
	
	}
	
	@GetMapping(path = "/patient/donars/loc/{place}")
	public DonarDTO getPatientDonarsByLoc(@PathVariable("place")String place) {

	Patient patient=this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/srch/loc/"+place,Patient.class);

	Donar[] donars=this.template.getForObject("http://DONAR-SERVICE/api/v1/donars/srch/loc/"+place,Donar[].class);

	dto.setPatients(patient);
	List<Donar> detailSet = Arrays.asList(donars);
	//List<Donar> detailSet = Arrays.stream(donars).collect(Collectors.toSet());
	dto.setDonars(detailSet);

	return dto;	
	
	}
	

}