package com.training.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Appoinment {
	 private Map<Doctor,Set<Patient>> map;

	public Appoinment() {
		super();
		map=new HashMap<>();	}

	public Appoinment(Map<Doctor, Set<Patient>> map) {
		super();
		this.map = map;
	}

	public Map<Doctor, Set<Patient>> getmap() {
		return map;
	}

	public void setmap(Map<Doctor, Set<Patient>> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Appoinment [map=" + map + "]";
	}
	 
	 
	 public Set<Patient> getPatients(Doctor key){
		 return this.map.get(key);
	 }
	 
}
