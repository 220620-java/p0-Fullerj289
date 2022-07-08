package bank0;

import java.util.Scanner;



public class BankApp {
	
	private static Scanner scan = new Scanner(System.in);
	static CreatingUserAccount userAccount = new CreatingUserAccount();
	static UserInfo customerInfo = new UserInfo();
	
	
	public static void main(String[] args) {
		String enterBank;
		
			System.out.println("Welcome to the James Online banking App");
			System.out.println("---------------------------------------");
			System.out.println("***************************************");
			System.out.println("1.To create an Account");
			System.out.println("2. To login your Account");
			System.out.println("3. To exit ");
			System.out.println("---------------------------------------");
			System.out.println("***************************************");
			enterBank = scan.nextLine();
			switch (enterBank) {
			case "1":
				newAccount();
				break;
			case "2":
				bankOnlineAccount();
				break;
			case "3":
				System.out.println("Goodbye");
				break;
			}
			
		scan.close();

	}
	public static void bankOnlineAccount() {
		System.out.println("Please Enter UserName: ");
		String accountUserName = scan.nextLine();
		userAccount.setUserName(accountUserName);
		System.out.println("Please Enter Name: ");
		String accountName = scan.nextLine();
		userAccount.setFullName(accountName);
		System.out.println("Please Enter Password: ");
		String accountPswd = scan.nextLine();
		userAccount.setPassword(accountPswd);
		
		
	}
	public static void newAccount() {
		System.out.println("Enter Name: ");
		String customerName = scan.nextLine();
		userAccount.setFullName(customerName);
		System.out.println("Enter UserName: ");
		String customerUserName = scan.nextLine();
		userAccount.setUserName(customerUserName);
		System.out.println("Enter email: ");
		String email = scan.nextLine();
		userAccount.setEmail(email);
		System.out.println("Enter current Address: ");
		String address = scan.nextLine();
		userAccount.setAddress(address);
		System.out.println("Create Password: ");
		String psswd = scan.nextLine();
		userAccount.setPassword(psswd);
		System.out.println("Enter Balance: ");
		double balance = scan.nextDouble();
		userAccount.setBalance(balance);
		customerInfo.customerAccount();
		String newCustomer;
		newCustomer = scan.nextLine();
		
		switch (scan.nextLine()) {
		case "1":
			customerInfo.deposit();
			break;
		case "2":
			customerInfo.withdraw();
			break;
		case "3":
			bankOnlineAccount();
		}
	}
	
}
