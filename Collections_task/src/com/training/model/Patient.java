package com.training.model;

public class Patient {
	private int patientId;
	private String patientName;
	private String patientLocation;
	private long mobilNumber;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientName, String patientLocation, long mobilNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientLocation = patientLocation;
		this.mobilNumber = mobilNumber;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientLocation() {
		return patientLocation;
	}
	public void setPatientLocation(String patientLocation) {
		this.patientLocation = patientLocation;
	}
	public long getMobilNumber() {
		return mobilNumber;
	}
	public void setMobilNumber(long mobilNumber) {
		this.mobilNumber = mobilNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (mobilNumber ^ (mobilNumber >>> 32));
		result = prime * result + patientId;
		result = prime * result + ((patientLocation == null) ? 0 : patientLocation.hashCode());
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (mobilNumber != other.mobilNumber)
			return false;
		if (patientId != other.patientId)
			return false;
		if (patientLocation == null) {
			if (other.patientLocation != null)
				return false;
		} else if (!patientLocation.equals(other.patientLocation))
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientLocation="
				+ patientLocation + ", mobilNumber=" + mobilNumber + "]";
	}
	
	
}