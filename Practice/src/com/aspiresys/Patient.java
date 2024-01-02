package com.aspiresys;


//Encapsulation

public class Patient {
	private int patientId;
	private String patientName;
	private String patientEmail;
	private int patientPhoneNo;
	private String patientAddress;
	
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
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public int getPatientPhoneNo() {
		return patientPhoneNo;
	}
	public void setPatientPhoneNo(int patientPhoneNo) {
		this.patientPhoneNo = patientPhoneNo;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	
//	Using Constructor
	
//	public Patient(int patientId, String patientName) {
//		this.patientId=patientId;
//		this.patientName=patientName;
//	}
}



