package Gautam_Rana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.graalvm.compiler.hotspot.stubs.ExceptionHandlerStub;

import java.sql.*;

public class DB {

	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "booksharingdb";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root";
	String password = "";

	public DB() {
		// TODO Auto-generated constructor stub

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url + dbName, userName, password);
			System.out.println("Connected to " + con.getCatalog());
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("Select * from tab");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println("Conection Refused");
			e.printStackTrace();
			;
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB db = new DB();
		System.out.println("DB String :"+db.url.toString());

	}

}
