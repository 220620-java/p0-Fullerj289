package com.revature.james;

import java.util.Scanner;

public class UserInfo {
	private String firstName = "firstName";
	private String lastName = "lastName";
	private String fullName = firstName + lastName;
	private String email;
	private int age;
	
	
	
	public void setUserInfo(String name) {
		this.firstName = "firstName";
		this.lastName = "lastName";
		this.age = 0;
		
		
	}
	public String getUserInfo() {
		
		
	}
	public static void userInput() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Full Name: ");
		String fullName = userInput.next();
		System.out.println("Welcome " + fullName);
		
		
		
		
	}
	
}
