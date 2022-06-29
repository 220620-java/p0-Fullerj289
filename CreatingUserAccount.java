package com.revature.james;



public class CreatingUserAccount {
	private String fullName;                     //use private modifier so only this class have access
	private String userName;
	private String email;
	private int age;
	private String job;
	private String address;
	private String password;
	
	public CreatingUserAccount () {
		this.fullName = "Incorrect Name";
		this.userName = "UserName is already existed";
		this.email = "Email is already existed";
		this.password = "invaild";							//Default Constructor
		this.age = 0;
		this.job = "Please provide job";
		this.address = "Need address";
		this.password = "Not Strong Enough";	
	}
	public CreatingUserAccount (String fullName, String userName, String email, String password) {
		this.fullName = fullName;
		this.userName = userName;  //creating info for first user to login
		this.email = email;
		this.password = password;

	}	
	
	
	
	
	public String getFullName() {                //set my getter&setter to grab the private field from class
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	
	
	
}
