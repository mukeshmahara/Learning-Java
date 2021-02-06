package org.mukeshmahara.jdbc.dao;

import org.mukeshmahara.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {


//        insert query

        String sql = "insert into student(id,name,city) values(?,?,?)";

//        firing the query

        int result = this.jdbcTemplate.update(sql, student.getStudentId(), student.getStudentName(), student.getStudentAddress());
        System.out.println("number of record inserted :" + result);
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
