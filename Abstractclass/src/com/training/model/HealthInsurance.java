package com.training.model;
import com.training.Insurance;
public class HealthInsurance extends Insurance {
	private String[] preExistingDiseases;
	
	
	
	@Override
	public double calculatePremium() {
		double premium=10000;
		for(String eachitem:preExistingDiseases) {
			//String item=eachitem.toLowerCase();
			if(eachitem.equalsIgnoreCase("BP") || eachitem.equalsIgnoreCase("sugar")  ) {
				premium=15000;
			}
			
		}
		
		return premium;
	}
	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases) {
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
	}
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String[] getPreExistingDiseases() {
		return preExistingDiseases;
	}



	public void setPreExistingaDiseases(String[] preExistingDiseases) {
		this.preExistingDiseases = preExistingDiseases;
	}



	
}
