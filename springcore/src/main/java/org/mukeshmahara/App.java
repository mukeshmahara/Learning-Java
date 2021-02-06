package org.mukeshmahara;

import org.mukeshmahara.entities.Student;
import org.mukeshmahara.jdbc.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student();
        student.setStudentId(111);
        student.setStudentName("captain");
        student.setStudentAddress("Btk");

        int result = studentDao.insert(student);
        System.out.println("student added "+result);
    }
}
