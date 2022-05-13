package com.example.demo.util.bidirection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.birectional.Doctor;
import com.example.demo.entity.birectional.Patient;
import com.example.demo.ifaces.bidirectional.*;

@Component
public class Utility {
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void create() {
		Doctor added=repo.save(doc);

		for(Patient eachPatient : patientList) {
		eachPatient.setDoctor(doc);
		patientRepo.save(eachPatient);
		}

		//Doctor added=repo.save(doc);

		if(added!=null) {

		System.out.println("One Record Added");
		}
		}
	
		//@Transactional using when changing the fetch type to lazy
		public void findAll() {
			List<Doctor> doctors=repo.findAll();
			for(Doctor eachDoctor:doctors) {
				System.out.println("Doctor id :"+eachDoctor.getDoctorId());
				System.out.println("Doctor Name :"+eachDoctor.getDoctorName());
				List<Patient> patients=eachDoctor.getPatientList();
				for(Patient eachPatient:patients) {
					System.out.println("Patient Name :"+eachPatient.getPatientName());
					System.out.println("Patient Mobile Number :"+eachPatient.getMobileNumber());
				}
			}
		}
		
		public void findDoctorFromPatient() {
			
			Patient entity=patientRepo.findById(1).get();
			System.out.println(entity.getPatientName());
			System.out.println(entity.getDoctor());
			
		}
}
