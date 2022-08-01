package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.ifaces.PatientRepository;

@Service
public class PatientService {
		private PatientRepository repo;
		
		@Autowired
		public PatientService(PatientRepository repo) {
			super();
			this.repo = repo;
		}
		
		public Patient add(Patient entity) {
			return this.repo.save(entity);
			
		}
		
		public List<Patient> findAll(){
			return this.repo.findAll();
		}
		
		public Patient findByBloodGroup(String name) {
			return this.repo.findByBloodGroup(name);
		}
		
		public Patient findByLocation(String place) {
			return this.repo.findByLocation(place);
		}


}
