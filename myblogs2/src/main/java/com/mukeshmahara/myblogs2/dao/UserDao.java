package com.mukeshmahara.myblogs2.dao;

import com.mukeshmahara.myblogs2.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private Connection con = null;

    //
    public UserDao(Connection con) {

        this.con = con;
    }

//    Method to insert data in database

    public boolean saveUser(User user) {
        boolean f = false;

        try {

//            user database
            String query = "insert into user(username,email,password,address,gender,phone,created_at) values(?,?,?,?,?,?,current_timestamp)";

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getAddress());
            pstmt.setString(5, user.getGender());
            pstmt.setString(6, user.getPhone());

            pstmt.executeUpdate();
            f = true;


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return f;

    }


    //get user by email and user password

    public User getUserByEmailAndPassword(String email, String password) throws SQLException {

        User user = null;

        String sql = "select * from user where email = ? and password = ?";
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1, email);
        psmt.setString(2, password);


        ResultSet rs = psmt.executeQuery();
        if (rs.next()) {
            user = new User();

            user.setId(Integer.parseInt(rs.getString("id")));
            user.setUsername(rs.getString("username"));

            user.setAddress(rs.getString("address"));
            user.setPassword(rs.getString("password"));
            user.setProfile(rs.getString("profile_img"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setPhone(rs.getString("phone"));
            user.setDateTime(rs.getString("created_at"));

        }
        return user;

    }

    public boolean updateUserInfo(User user) {
        boolean f = false;

        String sql = "update user set email =?,address = ?, phone = ?,profile_img = ?  where id = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getAddress());
            pstmt.setString(3, user.getPhone());
            pstmt.setString(4, user.getProfile());
            pstmt.setInt(5, user.getId());
            pstmt.executeUpdate();

            f = true;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;


    }

    public User getUserById(int uid) {
        User user = new User();
        try {
            String sql = "select * from user where id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, uid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setProfile(rs.getString("profile_img"));
                user.setDateTime(rs.getString("created_at"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }
}
