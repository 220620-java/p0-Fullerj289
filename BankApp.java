package com.revature.james;


// first I analysis and design concept from the OOAD(object-oriented analysis and design)
public class BankApp {
	//defining what the system is supposed to do
	// specifying how the system should do it
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n |||*   Welcome to JamesBank   *||| \n");
		System.out.println("############################################");
		System.out.println("############################################");
		System.out.println("\n 1. Creating an Account \n");
		
		System.out.println("\n 2. View Account \n");
		CreatingUserAccount user1 = new CreatingUserAccount("James fuller", "Fullerj", "jamesfuller@live.com", "W01fMan33");
	
		System.out.println(user1);
	
	}
	
	

}
