package bank0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

import bank0.utils.BankConnections;


public class CreatingUserAccount {
	private static String fullName;
	private static String userName;
	private static String email;
	private static String address;
	private static String password;
	private static String accountNumber;
	private static double balance = 0.0;
	private static String checkingAccount;
	private boolean haveAccount = true;

	public CreatingUserAccount() {
		fullName = "Incorrect Name";
		userName = "UserName is already existed";
		email = "Email is already existed";
		password = "invaild";
		address = "Need address";
		password = "Not Strong Enough";
	}

	public CreatingUserAccount(String fullName, String userName, String email, String password) {
		CreatingUserAccount.fullName = fullName;
		CreatingUserAccount.userName = userName;
		CreatingUserAccount.email = email;
		CreatingUserAccount.password = password;
	}

	public CreatingUserAccount(double balance, String fullName, String userName, String email, String password, String address, String accountNumber) {
		CreatingUserAccount.fullName = fullName;
		CreatingUserAccount.userName = userName;
		CreatingUserAccount.email = email;
		CreatingUserAccount.password = password;
		CreatingUserAccount.address = address;
		CreatingUserAccount.accountNumber = accountNumber;
		CreatingUserAccount.balance = balance;
		}

	public String getFullName() {
			return fullName;
	}

	public void setFullName(String fullName) {
		CreatingUserAccount.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		CreatingUserAccount.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		CreatingUserAccount.email = email;
	}

	public String getAddress() {
			return address;
	}

	public void setAddress(String address) {
		CreatingUserAccount.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		CreatingUserAccount.password = password;
	}

	public static String getAccountNumber() {
		return accountNumber;
	}

	public static void setAccountNumber(String accountNumber) {
		CreatingUserAccount.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		CreatingUserAccount.balance = balance;
	}

	public String getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(String checkingAccount) {
		CreatingUserAccount.checkingAccount = checkingAccount;
	}

	public boolean getHaveAccount() {
		return this.haveAccount;
	}

	public void setHaveAccount(boolean haveAccount) {
		this.haveAccount = haveAccount;
	}

	public int hashCode() {
		return Objects.hash(new Object[] { address, balance, checkingAccount, email, fullName, this.haveAccount,
				password, userName });
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			CreatingUserAccount other = (CreatingUserAccount) obj;
			return Objects.equals(address, address)
					&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(balance)
					&& Objects.equals(checkingAccount, checkingAccount) && Objects.equals(email, email)
					&& Objects.equals(fullName, fullName) && this.haveAccount == other.haveAccount
					&& Objects.equals(password, password) && Objects.equals(userName, userName);
		}
	}
	public void create(String fullName, String address, String userName, String password, String email ) {
		
		BankConnections objServerConnection = new BankConnections();
		Connection objConnection = objServerConnection.getConnection();
		
		
		String insertQuery = "INSERT INTO bank_0.customer_info"
							+ "(name, address, username, passwd, email)"
							+ "VALUES (?, ?, ?, ?, ?)";
		
		
		
		
		try {
			PreparedStatement stmt = objConnection.prepareStatement(insertQuery);
			stmt.setString(1, fullName);
			stmt.setString(2, address);
			stmt.setString(3, userName);
			stmt.setString(4, password);
			stmt.setString(5, email);
			System.out.println("Added to the database");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
