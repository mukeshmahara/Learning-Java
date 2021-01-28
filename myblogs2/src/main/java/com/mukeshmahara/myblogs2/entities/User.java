package com.mukeshmahara.myblogs2.entities;

import java.sql.Timestamp;

public class User {
    private int id;

    private String user_image;

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    private String username;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public String getDateTime() {
        return dateTime;
    }

    private String gender;
    private String phone;
    private String address;



    private String dateTime;


//    Constructors Here


    public User() {


    }

    public User(int id,
                String username,
                String email,
                String password,
                String gender,
                String phone) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
    }

    public User(String username,
                String email,
                String password,
                String gender,
                String address,
                String phone) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
        this.address = address;

    }

    //    Setters and getters Here
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
