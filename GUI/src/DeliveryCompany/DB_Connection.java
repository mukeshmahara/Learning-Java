package DeliveryCompany;

import java.sql.*;
import DeliveryCompany.Registration;

public class DB_Connection extends SQLException {

	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "app";
	String driver = "com.mysql.cj.jdbc.Driver";
	String userName = "root";
	String password = "password";

//	Connection conn=null;
	public DB_Connection() {

	}

	public Connection connectdb() throws SQLException, Exception {

		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url + dbName, userName, password);

		System.out.println("Connected to " + "\"" + dbName + "\"" + " Database");

		return conn;
	}
}
