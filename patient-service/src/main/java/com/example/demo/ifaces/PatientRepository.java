package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, String> {
	Patient findByBloodGroup(String name);
	Patient findByLocation(String place);


}
