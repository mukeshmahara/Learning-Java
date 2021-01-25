package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection con;

    public static Connection getCon() {
        if (con == null) {

            try {
                System.out.println("TESTING Connection");


                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myblogs","root","password");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}
