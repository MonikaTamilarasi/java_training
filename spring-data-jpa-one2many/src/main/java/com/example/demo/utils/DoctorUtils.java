package com.example.demo.utils;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.ifaces.DoctorRepository;

@Component
public class DoctorUtils {
	
	@Autowired
	List<Patient> patientlist;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create() {
		doc.setPatientList(patientlist);
		
		Doctor added=repo.save(doc);
		if(added!=null){
			System.out.println("One Record Added");
		}
	}
	//@Transactional using when changing the fetch type to lazy
		public void findAll() {
			List<Doctor> doctors=repo.findAll();
			for(Doctor eachDoctor:doctors) {
				System.out.println("Doctor id :"+eachDoctor.getDoctorId());
				System.out.println("Doctor Name :"+eachDoctor.getDepartment());
				List<Patient> patients=eachDoctor.getPatientList();
				for(Patient eachPatient:patients) {
					System.out.println("Patient Name :"+eachPatient.getPatientName());
					System.out.println("Patient Mobile Number :"+eachPatient.getMobileNumber());
				}
			}
		}
}
