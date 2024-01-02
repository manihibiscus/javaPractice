package com.aspiresys;

public class Doctors {

	public static void main(String args[]) {
		Dentist dentist=new Dentist("Dentist","Manikandan S", "12 Years",02152632, "09:00 AM - 12:00PM","Salem");
		System.out.println(dentist.availableTime);
		
//		We print only object the output is not understandable, 
//		so toSting method in all classes is used to convert the object to string to 
//		display correct manner
		
		System.out.println(dentist);

	}
}
