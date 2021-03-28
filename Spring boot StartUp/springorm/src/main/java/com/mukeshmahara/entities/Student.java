package com.mukeshmahara.entities;


import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//@Table(name = "student_details")
public class Student {

    @Id
//    @Column(name = "student_id")
    private int studentId;
    //    @Column (name = "student_name")
    private String studentName;
    //    @Column(name = "student_city")
    private String Studentcity;

    public Student() {
    }

    public Student(String studentName, String studentcity) {

        this.studentName = studentName;
        Studentcity = studentcity;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentcity() {
        return Studentcity;
    }

    public void setStudentcity(String studentcity) {
        Studentcity = studentcity;
    }


}
