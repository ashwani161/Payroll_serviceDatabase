package Payroll_Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	//public static void main(String[] args) {
	 String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service";
	 String userName = "root";
	 String password = "Ashu@8541";
		Connection connection;
		public Connection getConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
				return connection;
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		//System.out.println("Welcome to Mysql Database Connection");
}
