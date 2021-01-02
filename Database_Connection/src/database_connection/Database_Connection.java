/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_connection;
import java.sql.*;
/**
 *
 * @author YoLo
 */
public class Database_Connection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
           
        String conn = "jdbc:sqlserver://localhost\\.";
        String User = "mukesh";
        String pass = " ";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
           
        try{
            //Getting Connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con = DriverManager.getConnection(conn,User,pass);
                System.out.println("Connection Created");
            //Connection myConn = DriverManager.getConnection("jdbc:sqlserver://localhost:5566/MukeshDb","mukesh","mukesh");
            //Creating Statement
            //Statement myStmt = Myconn.createStatement();

            //Execute Sql Queries
            //ResultSet myRs = myStmt.executeQuery("Select * from student");
           String SQL = "Select * from student";
           stmt = con.createStatement();
           rs = stmt.executeQuery(SQL);
         
           //Process the result Set
           while(rs.next()){
            System.out.println(rs.getString("lname")+ ", "+rs.getString("fname"));
        }            
        }  
        
        
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
