package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "moni_driver")
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	
	@Id
	@Column(name = "id")
	private int driverId;
	
	@Column(name = "name")
	private String driverName;
	
	@Column(name = "mobile_number")
	private long mobileNumber;
	
	@Column(name = "rating")
	private double rating;
}
