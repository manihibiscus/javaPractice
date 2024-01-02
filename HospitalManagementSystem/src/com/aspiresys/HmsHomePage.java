package com.aspiresys;

import java.util.Scanner;

public class HmsHomePage {

	public static void main(String args[]) {
		System.out.println("Welcome to Hospital Management System");
		
		System.out.println("\"We Value Your Health \n Care for Your Smile\"");
		
		System.out.println(" * If you want an doctor's appointment,"
				+ "register first and then login.");
		System.out.println( " Enter - 1 =>" +  " Login" +  " ( or )" +  
				 " Enter - 2 =>"  + " Register ");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter your Choice - " );
		String enterNo = sc.nextLine();
		
		if (enterNo.equals("1")) {
			 Login login=new Login();
			 login.main(args);
		} 
		else if (enterNo.equals("2")) {
			Register register=new Register();
			register.main(args);
		}
		else {
			System.out.println("You have Entered Invalid Choice - Try again after Some");
			main(args);
		}
	}
}
