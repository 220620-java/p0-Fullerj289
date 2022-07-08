package bank0.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class BankConnections {
	private static final String String = null;
	private static BankConnections connUtil;
	private String dbUser;

	public BankConnections() {
    }

	public static synchronized BankConnections getConnectionUtil() {
		if (connUtil == null) {
			connUtil = new BankConnections();
		}

		return connUtil;
	}
	

	public static BankConnections getConnUtil() {
		return connUtil;
	}

	public static void setConnUtil(BankConnections connUtil) {
		BankConnections.connUtil = connUtil;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public static String getString() {
		return String;
	}

	public Connection getConnection() {
		Connection conn = null;
		String dbUrl = "james-revature-database-1.cqkotqk7ev88.us-east-2.rds.amazonaws.com";
		String dbUser = "postgres";
		String dbPass = "Wo1fMan33!1";

		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		} catch (ClassNotFoundException | SQLException var6) {
			var6.printStackTrace();
		}

		return conn;
	}

}