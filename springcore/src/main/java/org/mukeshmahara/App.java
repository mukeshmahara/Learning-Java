package org.mukeshmahara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext   context = new ClassPathXmlApplicationContext("app-context.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);


//        insert query

        String sql = "insert into student(id,name,city) values(?,?,?)";

//        firing the query

        int result = template.update(sql, 2, "Suraj2", "Kanchanpur2");
        System.out.println("number of record inserted :"+result);
    }
}
