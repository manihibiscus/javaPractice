package com.aspiresys;

public class GeneralDoctor extends MedicalFieldDetails {
	
	String availableTime;

	public GeneralDoctor(String medicalFieldName, String doctorName, String experiance, int licenseNO,
			String availableTime) {
		super(medicalFieldName, doctorName, experiance, licenseNO);
		this.availableTime = availableTime;
	}
	
	
}
