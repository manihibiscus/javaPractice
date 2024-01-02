package com.aspiresys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

interface ConnectionDetails{
	
String url= "jdbc:mysql://localhost:3306/hospitalmanagementsystem";

String user="root";

String pass ="Mani@777";
}

public class JdbcConnectionMySql implements ConnectionDetails{
	

	
	
public static void main(String[] args) {
		
		//creating the connection
		
		String url= "jdbc:mysql://localhost:3306/hospitalmanagementsystem";
		
		String user="root";
		
		String pass ="Mani@777";
		
		//Entering the data
		
		
		
	//Inserting data using SQL query
		RegisterValidation register = new RegisterValidation ();
		 String patientName=register.patientNameValue;
		 String phone=register.phoneValue;
		 String email=register.emailValue;
		 String gender=register.genderValue;
		 
		String sql="insert into hospitalmanagementsystem.Register value('"+patientName+"','"+phone+"','"+email+"','"+gender+"') ";
				
		Connection connection=null; 
		
		try 
		 {
			
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//Class.forName("com.mysql.jdbc.driver");
			//Reference to connection interface
			
			connection=DriverManager.getConnection(url,user,pass);
			System.out.println("Connectin successfull*");
			
			java.sql.Statement statement = connection.createStatement();
			
			int result=statement.executeUpdate(sql);
			
			if(result ==1)
				
				System.out.println("inserted successfull1y :"+sql);
			else
				System.out.println("inserted failed");
				
			
		}
		
		catch(Exception exception)
		{
			System.err.println(exception);
		}
		
		finally
		{
			
			try
			{
				
				connection.close();
				System.err.println("Connection is closed");
				
			}
			
			catch(Exception exception)
			{
				System.err.println(exception);
			}
		}
	}
	 
	}
	

