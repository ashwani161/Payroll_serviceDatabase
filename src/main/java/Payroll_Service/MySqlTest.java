package Payroll_Service;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

public class MySqlTest {
	
	@Test
	public void Checking_MySql_Connection() {
		DBConnection dbConnection = new DBConnection();
		Connection connection = dbConnection.getConnection();
		Assert.assertNotEquals(null,connection);
	}

}
