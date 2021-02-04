package com.mukeshmahara.myblogs2.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection con;

    public static Connection getCon() {
        if (con == null) {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myblogs", "root", "password");

            } catch (Exception e) {
                System.out.println("Unable to load Driver");
                e.printStackTrace();
            }
        }


        return con;
    }

}
