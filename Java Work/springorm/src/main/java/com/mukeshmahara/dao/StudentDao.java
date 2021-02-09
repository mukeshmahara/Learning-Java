package com.mukeshmahara.dao;

import com.mukeshmahara.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    private HibernateTemplate hibernateTemplate;


    //saving student to database
    public int insert(Student student) {
        Integer i = (Integer)hibernateTemplate.save(student);
        return i;

    }
}
