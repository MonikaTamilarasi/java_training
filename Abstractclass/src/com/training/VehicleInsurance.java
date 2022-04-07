package com.training;

public class VehicleInsurance extends Insurance {
	private String vehicleModel;
	private int yearOfManufacture;

	@Override
	public double calculatePremium() {
		double premium = 1000;
		if(yearOfManufacture<2020 && vehicleModel.equals("car")) {
			premium=2000;
		}
		return premium;
	}

	public VehicleInsurance(int policyNumber, String policyHolderName,  String vehicleModel,
			int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}



}
