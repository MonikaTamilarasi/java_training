
package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "moni3_patient")


public class Patient {
@Id


@Column(name = "patient_id")
int patientId;

@Column(name = "patient_name")
String patientName;

@Column(name = "mobile_number")
long mobileNumber;


@Column(name = "location")
String location;




@Column(name = "blood_group")
String bloodGroup;

@Column(name = "age")
int age;


}

