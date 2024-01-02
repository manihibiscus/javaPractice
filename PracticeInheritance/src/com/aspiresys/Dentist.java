package com.aspiresys;

public class Dentist extends GeneralDoctor{

	String workingStatus;
	
	@Override
	public String toString() {
		return "Dentist [workingStatus=" + workingStatus + ", availableTime=" + availableTime + ", medicalFieldName="
				+ medicalFieldName + ", doctorName=" + doctorName + ", experiance=" + experiance + ", licenseNO="
				+ licenseNO + "]";
	}
	
	public Dentist(String medicalFieldName, String doctorName, String experiance, int licenseNO, String availableTime,
			String workingStatus) {
		super(medicalFieldName, doctorName, experiance, licenseNO, availableTime);
		this.workingStatus = workingStatus;
	}
	
}
