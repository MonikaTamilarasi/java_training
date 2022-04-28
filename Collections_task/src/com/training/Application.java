package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.model.Appoinment;
import com.training.model.Doctor;
import com.training.model.Patient;


public class Application {
	public static void main(String[] args) {
		
		Patient Patient1=new Patient(101,"aaa","Palani",9876543210l);
		Patient Patient2=new Patient(102,"bbb","Karur",7654321098l);
		Patient Patient3=new Patient(103,"ccc","Dindigul",6543210987l);
		
		
		HashSet<Patient> patients=new HashSet<>();
		patients.add(Patient1);
		patients.add(Patient2);
		patients.add(Patient3);
		
		Doctor moni=new Doctor(111, "MONI", "DENTAL", patients);
//		System.out.println("DOCTOR : "+moni.getDoctorName());
//		for(Patient eachPatient:moni.getPatients()) {
//			System.out.println(eachPatient);
//		}
		
		Patient Patient4=new Patient(106,"ddd","chennai",9876543210l);
		Patient Patient5=new Patient(107,"eee","mysore",7654321098l);
		Patient Patient6=new Patient(108,"fff","trichy",6543210987l);
		
		
		HashSet<Patient> patients2=new HashSet<>();
		patients2.add(Patient4);
		patients2.add(Patient5);
		patients2.add(Patient6);

		Doctor rev=new Doctor(222, "REV", "VPD", patients2);
		
		 Map<Doctor,Set<Patient>> map=new HashMap<>();

		 map.put(moni, patients);
		 map.put(rev, patients2);
		 Appoinment app=new Appoinment(map);
		 System.out.println(app.getPatients(moni));
		
	}
}
