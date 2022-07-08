package bank0;

import java.util.Objects;
import java.util.Scanner;


public class UserInfo {
	private int customerId;
	private String fullName;
	private String address;
	private String userName;
	private String passwd;
	private String email;
	static CreatingUserAccount user1 = new CreatingUserAccount();
	static Scanner scan1 = new Scanner(System.in);
	static BankApp bank = new BankApp();

	public UserInfo() {
		this.customerId = 0;
		this.fullName = " ";
		this.address = " ";
		this.userName = " ";
		this.passwd = " ";
		this.email = " ";
	}

	public UserInfo(int customerId, String fullName, String userName, String address, String passwd, String email) {
		this.customerId = customerId;
		this.address = address;
		this.userName = userName;
		this.passwd = passwd;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserInfo [customerId=" + customerId + ", fullName=" + fullName + ", address=" + address + ", userName="
				+ userName + ", passwd=" + passwd + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, customerId, email, fullName, passwd, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		return Objects.equals(address, other.address) && customerId == other.customerId
				&& Objects.equals(email, other.email) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(passwd, other.passwd) && Objects.equals(userName, other.userName);
	}
	public void customerAccount() {
		System.out.println("Customer Account Information: " + fullName);
		System.out.println("Account type: " + user1.getCheckingAccount());
		System.out.println("Customer balance: " + user1.getBalance());
		System.out.println("1. To make a deposit: ");
		System.out.println("2. To make a withdraw: ");
		System.out.println("3. Take you back to Homepage: ");
	}
	public void deposit() {
		String exit;
		System.out.println("Enter the amount you want to deposit: ");
		double deposit = scan1.nextDouble();
		double newBalance = user1.getBalance() + deposit;
		user1.setBalance(newBalance);
		System.out.println("1. Exit");
		System.out.println("2. withdraw money");
		exit = scan1.nextLine();
		switch (exit) {
		case "1":
			bank.bankOnlineAccount();
			break;
		case "2":
			withdraw();
			break;
		}
		
	}
	public void withdraw() {
		double amount;
		System.out.println("Enter the amount you want to withdraw: ");
		amount = scan1.nextDouble();
		if (user1.getBalance() >= amount) {
			System.out.println("The Current balance: " + user1.getBalance());
		}
		else {
			System.out.println("Your Not enough Funds" + amount);
		}
		System.out.println("1.To exit app: ");
		System.out.println("2. Go to UserLogin: ");
		String user1Input = scan1.nextLine();
		switch (user1Input) {
		case "1":
			System.out.println("See you later");
			break;
		case "2":
			bank.bankOnlineAccount();
			break;
		
		}
	}
	


}
