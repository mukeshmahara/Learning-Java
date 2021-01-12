package com.mukeshmahara.springrestapi.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigInteger;

@Embeddable
public class Author {

    private int author_id;
    private String author_first_name;
    private String author_last_name;
    private String address;

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", author_first_name='" + author_first_name + '\'' +
                ", author_last_name='" + author_last_name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone=" + phone +
                '}';
    }

    private  String email;
    private int age;

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String sex;
    private String phone;

    public Author() {
        super();
    }

    public Author(int author_id, String author_first_name, String author_last_name, String address, String email, int age, String sex, String  phone) {
        this.author_id = author_id;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.phone = phone;

    }

}
