package com.aspiresys;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validation{
	public static String userNameValue, passwordValue ;
	public Validation() {
		System.out.println("<-------------- Welcome to Login ------------->");
		userNameValidation();
	}
	
	void userNameValidation(){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Username to Continue - ");
		String userName = userInput.nextLine();
		Pattern userPattern = Pattern.compile("^[0-9a-zA-Z]+[._]{0,1}[0-9a-zA-Z]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3}){0,1}$");	
		Matcher userPatternMatch=userPattern.matcher(userName);
		if(userName.isEmpty()) {
			System.out.println("Username is not Empty");
			userNameValidation();
		}
		else if(!userPatternMatch.matches()) {
			System.out.println("Enter valid Username");
			userNameValidation();
		}
		else {
			userNameValue=userName;
			passwordValidation();
		}
	}
	void passwordValidation() {
		Scanner passInput = new Scanner(System.in);
		System.out.print("Enter Password to Continue - ");
		String password = passInput.nextLine();
		Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,14}$");	
		Matcher passPatternMatch=passwordPattern.matcher(password);
		if(password.isEmpty()) {
			System.out.println("Password is not Empty");
			userNameValidation();
		}
		else if(!passPatternMatch.matches()) {
			System.out.println("Enter valid Password");
			userNameValidation();
		}
		else {
			passwordValue=password;
			System.out.println("Login Successful");
		}
	}
//	void checkingDb() {
//		JdbcConnectionMySql jdbcConnectionMySql=new JdbcConnectionMySql();
//		jdbcConnectionMySql.loginValidation(userNameValue, passwordValue);
//	}
	
	 	
}
public class Login {
	public static void main(String args[]) {
	Validation validation=new Validation();
	}
}
