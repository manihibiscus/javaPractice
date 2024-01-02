package com.aspiresys;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegisterValidation {
	public static String patientNameValue, phoneValue, emailValue, genderValue;
	void RegisteringPage() {
		System.out.println("<------------------Welcome to Register------------------>");
		patientNameValidation();
	}
	void patientNameValidation(){
		Scanner nameInput = new Scanner(System.in);
		System.out.print("Enter your Name to Continue - ");
		String patientName = nameInput.nextLine();
		Pattern patientNamePattern = Pattern.compile("^(?!.*([a-zA-Z])\\1\\1)(?=.*[a-zA-Z].*[a-zA-Z].*[a-zA-Z])[\\sA-Za-z]+$");	
		Matcher patientNamePatternMatch=patientNamePattern.matcher(patientName);
		if(patientName.isEmpty()) {
			System.out.println("Name is not Empty");
			patientNameValidation();
		}
		else if(!patientNamePatternMatch.matches()) {
			System.out.println("Enter valid Name");
			patientNameValidation();
		}
		else {
			patientNameValue=patientName;
			phoneValidation();
		}
	}
	void phoneValidation(){
		Scanner phoneInput = new Scanner(System.in);
		System.out.print("Enter your Phone Number to Continue - ");
		String phone = phoneInput.nextLine();
		Pattern phonePattern = Pattern.compile("^[6-9](?!.*(\\d)\\1{4})\\d{9}$");	
		Matcher phonePatternMatch=phonePattern.matcher(phone);
		if(phone.isEmpty()) {
			System.out.println("phone Number is not Empty");
			phoneValidation();
		}
		else if(!phonePatternMatch.matches()) {
			System.out.println("Enter valid Phone Number");
			phoneValidation();
		}
		else {
			phoneValue=phone;
			emailValidation();
		}
	}
	void emailValidation(){
		Scanner emailInput = new Scanner(System.in);
		System.out.print("Enter your Email Id to Continue - ");
		String email = emailInput.nextLine();
		Pattern emailPattern = Pattern.compile("^(?=[a-zA-Z0-9._%+-]{4,})(?!.*([a-zA-Z0-9])\\1\\1\\1)(?!.*(\\d)\\3)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");	
		Matcher emailPatternMatch=emailPattern.matcher(email);
		if(email.isEmpty()) {
			System.out.println("Email Id is not Empty");
			emailValidation();
		}
		else if(!emailPatternMatch.matches()) {
			System.out.println("Enter valid Email Id");
			emailValidation();
		}
		else {
			emailValue=email;
			genderValidation();
		}
	}
	void genderValidation(){
		Scanner genderInput = new Scanner(System.in);
		System.out.print("Enter your Gender to Continue - ");
		String gender = genderInput.nextLine();
//		Pattern genderPattern = Pattern.compile("^[a-zA-z]$");	
//		Matcher genderPatternMatch=genderPattern.matcher(gender);
		if(gender.isEmpty()) {
			System.out.println("Gender is not Empty");
			genderValidation();
		}
//		else if(!genderPatternMatch.matches()) {
//			System.out.println("Alphabats Only!");
//			genderValidation();
//		}
		else {
			genderValue=gender;
			UpdatingDb();
		}
	}
	void UpdatingDb() {
//		JdbcConnectionMySql jdbcConnectionMySql=new JdbcConnectionMySql();
//		jdbcConnectionMySql.RegisterData(patientNameValue, phoneValue, emailValue, genderValue);
		JdbcConnectionMySql jdbcConnectionMysql=new JdbcConnectionMySql();
		jdbcConnectionMysql.main(null);
	}
	
	
}
public class Register {
	public static void main(String args[]) {
	RegisterValidation registerValidation=new RegisterValidation();
	registerValidation.RegisteringPage();
	}
}

