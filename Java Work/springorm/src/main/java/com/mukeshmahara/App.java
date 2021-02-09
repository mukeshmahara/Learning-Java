package com.mukeshmahara;

import com.mukeshmahara.dao.StudentDao;
import com.mukeshmahara.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
StudentDao studentDao = context.getBean("studentDao",StudentDao.class);

Student student = new Student("Mukesh captain","kanchanpur");

}

