package com.example.demo.entity.birectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="moni_doctor_one_to_many_bid2")
@Setter
@Getter

@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
	
	@Id
	@Column(name="doctor_id")
	int doctorId;
	
	@Column(name="doctor_name")
	String doctorName;
	
	@Column(name="department")
	String department;
	
	@Column(name="phone_number")
	long phoneNumber;
	
	@OneToMany(mappedBy = "doctor",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	List<Patient> patientList;

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
