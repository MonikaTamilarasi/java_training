package com.example.demo.dto;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Donar;
import com.example.demo.entity.Patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component

public class DonarDTO {
	
	private Patient patients;
	private List<Donar> donars;
}
