package com.aspiresys;


public class MainFIle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Patient patient=new Patient();
//		patient.setPatientId(156);
//		patient.setPatientName("Manikandan");
//		System.out.println(patient.getPatientId()+"\n"+patient.getPatientName());
//		SampleInterface obj=new SampleInterface();
		
		Patients obj=new DoctorDetails();
		obj.patientDetails();
		obj.doctorDetails();
		
	}
}
