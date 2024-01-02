package com.aspiresys;

public class PracticeTryCatch {

	void display(int number) {
	int arr[]=new int[5];
	try {
	int value=arr[number];
	System.out.println(value+2);
	}
	catch(Exception e){
		System.out.println("Out of Bounds Error");
	}
	
	System.out.println("After Exception Executed");
	}
}
